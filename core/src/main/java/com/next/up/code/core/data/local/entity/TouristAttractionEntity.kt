package com.next.up.code.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "touristAttractionTable")
data class TouristAttractionEntity(
    @PrimaryKey(autoGenerate = true)
    val touristAttractionId: Int,
    val touristAttractionName: String,
    val address: String,
    val districtName: String,
    val image: String,
    val latitude: String,
    val longitude: String,
    var isFavorite: Boolean
)