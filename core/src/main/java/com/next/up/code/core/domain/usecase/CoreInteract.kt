package com.next.up.code.core.domain.usecase

import com.next.up.code.core.data.Resource
import com.next.up.code.core.data.api.response.item.VideoTouristAttractionItem
import com.next.up.code.core.domain.model.GalleryTouristAttraction
import com.next.up.code.core.domain.model.Rent
import com.next.up.code.core.domain.model.Ticket
import com.next.up.code.core.domain.model.TouristAttraction
import com.next.up.code.core.domain.model.VideoTouristAttraction
import com.next.up.code.core.domain.repository.ICoreRepository
import kotlinx.coroutines.flow.Flow

class CoreInteract(private val coreRepository: ICoreRepository) : CoreUseCase {
    override fun getAllTouristAttraction(): Flow<Resource<List<TouristAttraction>>> =
        coreRepository.getAllTouristAttraction()

    override fun getTicket(id: Int): Flow<Resource<List<Ticket>>> = coreRepository.getTicket(id)
    override fun getRent(id: Int): Flow<Resource<List<Rent>>> = coreRepository.getRent(id)

    override fun getGallery(id: Int): Flow<Resource<List<GalleryTouristAttraction>>> =
        coreRepository.getGallery(id)

    override fun getVideo(id: Int): Flow<Resource<VideoTouristAttraction>> =
        coreRepository.getVideo(id)

    override fun getFavoriteTouristAttraction() = coreRepository.getFavoriteTouristAttraction()

    override fun setFavoriteTouristAttraction(
        touristAttraction: TouristAttraction,
        state: Boolean
    ) =
        coreRepository.setFavoriteTouristAttraction(touristAttraction, state)
}
