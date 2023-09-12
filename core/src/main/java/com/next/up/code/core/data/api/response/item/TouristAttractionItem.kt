package com.next.up.code.core.data.api.response.item

import com.google.gson.annotations.SerializedName

data class TouristAttractionItem(
    val id: Int,
    @field:SerializedName("nama_objek_wisata")
    val touristAttractionName: String,
    val upt: String,
    @field:SerializedName("alamat")
    val address: String,
    @field:SerializedName("koordinat")
    val coordinate: CoordinateItem,
    @field:SerializedName("gambar")
    val thumbnail: String,
    @field:SerializedName("kabupaten")
    val districtItem: DistrictItem
)