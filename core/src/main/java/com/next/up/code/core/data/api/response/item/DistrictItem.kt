package com.next.up.code.core.data.api.response.item

import com.google.gson.annotations.SerializedName

data class DistrictItem(
    val id: Int,
    @field:SerializedName("nama")
    val districtName: String
)
