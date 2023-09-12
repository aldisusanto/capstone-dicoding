package com.next.up.code.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TouristAttraction(
    val touristAttractionId: Int,
    val touristAttractionName: String,
    val address: String,
    val districtName: String,
    val image: String,
    val latitude: String,
    val longitude: String,
    val isFavorite: Boolean
) : Parcelable
