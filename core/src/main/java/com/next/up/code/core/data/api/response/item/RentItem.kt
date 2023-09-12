package com.next.up.code.core.data.api.response.item

import com.google.gson.annotations.SerializedName

data class RentItem(
    @field:SerializedName("kontak")
    val contact: Any? = null,

    @field:SerializedName("harga")
    val price: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("nama_tempat")
    val placeName: String,

    @field:SerializedName("gambar")
    val image: String
)
