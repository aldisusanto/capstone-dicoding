package com.next.up.code.core.domain.usecase

import com.next.up.code.core.data.Resource
import com.next.up.code.core.domain.model.GalleryTouristAttraction
import com.next.up.code.core.domain.model.Rent
import com.next.up.code.core.domain.model.Ticket
import com.next.up.code.core.domain.model.TouristAttraction
import com.next.up.code.core.domain.model.VideoTouristAttraction
import kotlinx.coroutines.flow.Flow

interface CoreUseCase {
    fun getAllTouristAttraction(): Flow<Resource<List<TouristAttraction>>>
    fun getTicket(id: Int): Flow<Resource<List<Ticket>>>
    fun getRent(id: Int): Flow<Resource<List<Rent>>>
    fun getGallery(id: Int): Flow<Resource<List<GalleryTouristAttraction>>>
    fun getVideo(id: Int): Flow<Resource<VideoTouristAttraction>>
    fun getFavoriteTouristAttraction(): Flow<List<TouristAttraction>>
    fun setFavoriteTouristAttraction(touristAttraction: TouristAttraction, state: Boolean)
}