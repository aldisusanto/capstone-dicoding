package com.next.up.code.core.data

import com.next.up.code.core.data.api.ApiDataSource
import com.next.up.code.core.data.api.network.ApiResponse
import com.next.up.code.core.data.api.response.item.TouristAttractionItem
import com.next.up.code.core.data.local.LocalDataSource
import com.next.up.code.core.domain.model.GalleryTouristAttraction
import com.next.up.code.core.domain.model.Rent
import com.next.up.code.core.domain.model.Ticket
import com.next.up.code.core.domain.model.TouristAttraction
import com.next.up.code.core.domain.model.VideoTouristAttraction
import com.next.up.code.core.domain.repository.ICoreRepository
import com.next.up.code.core.utils.AppExecutors
import com.next.up.code.core.utils.DataMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class CoreRepository(
    private val apiDataSource: ApiDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : ICoreRepository {
    override fun getAllTouristAttraction(): Flow<Resource<List<TouristAttraction>>> =
        object : NetworkBoundResource<List<TouristAttraction>, List<TouristAttractionItem>>() {
            override fun loadFromDB(): Flow<List<TouristAttraction>> {

                return localDataSource.getAllTouristAttraction().map {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<TouristAttraction>?): Boolean {
                if (data.isNullOrEmpty()) {
                    return true
                }
                return false
            }

            override suspend fun createCall(): Flow<ApiResponse<List<TouristAttractionItem>>> =
                apiDataSource.getTouristAttraction()

            override suspend fun saveCallResult(data: List<TouristAttractionItem>) {
                val touristAttractionList = DataMapper.mapResponsesToEntities(data)
                withContext(Dispatchers.IO) {
                    localDataSource.insertTouristAttraction(touristAttractionList)
                }
            }
        }.asFlow()

    override fun getTicket(id: Int): Flow<Resource<List<Ticket>>> {
        return apiDataSource.getTicket(id).map { response ->
            when (response) {
                is ApiResponse.Success -> Resource.Success(response.data.map { ticketItem ->
                    Ticket(
                        ticketItem.id,
                        ticketItem.originCategory,
                        ticketItem.price,
                        ticketItem.category
                    )
                })
                is ApiResponse.Empty -> Resource.Loading()

                is ApiResponse.Error -> Resource.Error(response.errorMessage)
            }
        }
    }

    override fun getRent(id: Int): Flow<Resource<List<Rent>>> {

        return apiDataSource.getRent(id).map { response ->
            when (response) {
                is ApiResponse.Success -> Resource.Success(response.data.map { rentItem ->
                    Rent(
                        rentItem.id,
                        rentItem.placeName,
                        rentItem.contact,
                        rentItem.price,
                        rentItem.image
                    )
                })
                is ApiResponse.Empty -> Resource.Loading()

                is ApiResponse.Error -> Resource.Error(response.errorMessage)
            }
        }
    }

    override fun getGallery(id: Int): Flow<Resource<List<GalleryTouristAttraction>>> {

        return apiDataSource.getGalleryTouristAttraction(id).map { response ->
                when (response) {
                    is ApiResponse.Success -> Resource.Success(response.data.map { galleryItem ->
                        GalleryTouristAttraction(
                            galleryItem.id,
                            galleryItem.name,
                            galleryItem.image,
                            galleryItem.description
                        )
                    })

                    is ApiResponse.Empty -> Resource.Loading()
                    is ApiResponse.Error -> Resource.Error(response.errorMessage)
                }
            }
    }

    override fun getVideo(id: Int): Flow<Resource<VideoTouristAttraction>> {

        return apiDataSource.getVideoTouristAttraction(id).map { response ->
                when (response) {
                    is ApiResponse.Success -> Resource.Success(VideoTouristAttraction(response.data.link))

                    is ApiResponse.Empty -> Resource.Loading()
                    is ApiResponse.Error -> Resource.Error(response.errorMessage)
                }
            }
    }


    override fun getFavoriteTouristAttraction(): Flow<List<TouristAttraction>> {
        return localDataSource.getFavoriteTouristAttraction().map {
            DataMapper.mapEntitiesToDomain(it)
        }
    }

    override fun setFavoriteTouristAttraction(
        touristAttraction: TouristAttraction, state: Boolean
    ) {
        val touristAttractionEntity = DataMapper.mapDomainToEntity(touristAttraction)
        appExecutors.diskIO()
            .execute { localDataSource.setFavoriteTourism(touristAttractionEntity, state) }
    }


}