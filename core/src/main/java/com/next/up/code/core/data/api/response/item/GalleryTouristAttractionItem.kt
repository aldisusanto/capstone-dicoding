package com.next.up.code.core.data.api.response.item

import com.google.gson.annotations.SerializedName

data class GalleryTouristAttractionItem(
    @field:SerializedName("nama") val name: String? = null,

    @field:SerializedName("id") val id: Int? = null,

    @field:SerializedName("deskripsi") val description: String? = null,

    @field:SerializedName("gambar") val image: String? = null
)
