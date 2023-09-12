package com.next.up.code.core.data.api.network

import com.next.up.code.core.data.api.response.ResponseData
import com.next.up.code.core.data.api.response.item.GalleryTouristAttractionItem
import com.next.up.code.core.data.api.response.item.RentItem
import com.next.up.code.core.data.api.response.item.TicketItem
import com.next.up.code.core.data.api.response.item.TouristAttractionItem
import com.next.up.code.core.data.api.response.item.VideoTouristAttractionItem
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("objek-wisata")
    suspend fun getTouristAttraction(): ResponseData<List<TouristAttractionItem>>

    @GET("karcis/objek-wisata/{id}")
    suspend fun getTicket(@Path("id") id: Int): ResponseData<List<TicketItem>>

    @GET("galeri-foto/objek-wisata/{id}")
    suspend fun getGalleryTouristAttraction(@Path("id") id: Int): ResponseData<List<GalleryTouristAttractionItem>>

    @GET("galeri-video/objek-wisata/{id}")
    suspend fun getVideoTouristAttraction(@Path("id") id: Int): ResponseData<VideoTouristAttractionItem>

    @GET("sewa-tempat/objek-wisata/{id}")
    suspend fun getRent(@Path("id") id: Int): ResponseData<List<RentItem>>

}