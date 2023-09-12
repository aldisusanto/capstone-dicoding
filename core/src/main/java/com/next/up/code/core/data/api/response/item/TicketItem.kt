package com.next.up.code.core.data.api.response.item

import com.google.gson.annotations.SerializedName

data class TicketItem(
    @field:SerializedName("kategori_asal") val originCategory: String,

    @field:SerializedName("harga") val price: String,

    @field:SerializedName("kategori") val category: String,

    @field:SerializedName("id") val id: Int,
)