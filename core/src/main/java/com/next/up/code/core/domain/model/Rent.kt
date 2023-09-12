package com.next.up.code.core.domain.model

data class Rent(
    val id: Int,
    val placeName: String,
    val contact: Any? = null,
    val price: String,
    val image: String
)
