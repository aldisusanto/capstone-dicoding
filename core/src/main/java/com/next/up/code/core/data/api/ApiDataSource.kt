package com.next.up.code.core.data.api

import com.next.up.code.core.data.api.network.ApiResponse
import com.next.up.code.core.data.api.network.ApiService
import com.next.up.code.core.data.api.response.item.GalleryTouristAttractionItem
import com.next.up.code.core.data.api.response.item.RentItem
import com.next.up.code.core.data.api.response.item.TicketItem
import com.next.up.code.core.data.api.response.item.TouristAttractionItem
import com.next.up.code.core.data.api.response.item.VideoTouristAttractionItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class ApiDataSource(private val apiService: ApiService) {
    fun getTouristAttraction(): Flow<ApiResponse<List<TouristAttractionItem>>> {
        return flow {
            try {
                val response = apiService.getTouristAttraction()
                val data = response.data
                if (data.isNotEmpty()) {
                    emit(ApiResponse.Success(data))
                } else {
                    emit(ApiResponse.Empty)
                }

            } catch (e: Exception) {
                emit(ApiResponse.Error(e.message.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    fun getTicket(id: Int): Flow<ApiResponse<List<TicketItem>>> {
        return flow {
            emit(ApiResponse.Empty)
            try {
                val response = apiService.getTicket(id)
                val data = response.data
                if (data.isNotEmpty()) {
                    emit(ApiResponse.Success(data))
                } else {
                    emit(ApiResponse.Empty)
                }

            } catch (e: Exception) {
                emit(ApiResponse.Error(e.message.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    fun getRent(id: Int): Flow<ApiResponse<List<RentItem>>> {
        return flow {
            emit(ApiResponse.Empty)
            try {
                val response = apiService.getRent(id)
                val data = response.data
                if (data.isNotEmpty()) {
                    emit(ApiResponse.Success(data))
                } else {
                    emit(ApiResponse.Empty)
                }

            } catch (e: Exception) {
                emit(ApiResponse.Error(e.message.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    fun getGalleryTouristAttraction(id: Int): Flow<ApiResponse<List<GalleryTouristAttractionItem>>> {
        return flow {
            emit(ApiResponse.Empty)
            try {
                val response = apiService.getGalleryTouristAttraction(id)
                val data = response.data
                if (data.isNotEmpty()) {
                    emit(ApiResponse.Success(data))
                } else {
                    emit(ApiResponse.Empty)
                }

            } catch (e: Exception) {
                emit(ApiResponse.Error(e.message.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    fun getVideoTouristAttraction(id: Int): Flow<ApiResponse<VideoTouristAttractionItem>> {
        return flow {
            emit(ApiResponse.Empty)
            try {
                val response = apiService.getVideoTouristAttraction(id)
                val data = response.data
                emit(ApiResponse.Success(data))

            } catch (e: Exception) {
                emit(ApiResponse.Error(e.message.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

}