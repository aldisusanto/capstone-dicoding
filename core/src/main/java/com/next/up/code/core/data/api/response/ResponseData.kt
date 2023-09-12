package com.next.up.code.core.data.api.response

import com.google.gson.annotations.SerializedName

data class ResponseData<T>(
    val message: String,
    val success: Boolean,
    @field:SerializedName("Data")
    val data: T
)
