package com.next.up.code.core.utils

import com.next.up.code.core.data.api.response.item.TouristAttractionItem
import com.next.up.code.core.data.local.entity.TouristAttractionEntity
import com.next.up.code.core.domain.model.TouristAttraction

object DataMapper {
    fun mapResponsesToEntities(input: List<TouristAttractionItem>): List<TouristAttractionEntity> {
        val tourismList = ArrayList<TouristAttractionEntity>()
        input.map {
            val touristAttraction = TouristAttractionEntity(
                touristAttractionId = it.id,
                touristAttractionName = it.touristAttractionName,
                address = it.address,
                districtName = it.districtItem.districtName,
                image = it.thumbnail,
                latitude = it.coordinate.latitude,
                longitude = it.coordinate.longitude,
                isFavorite = false
            )

            tourismList.add(touristAttraction)
        }
        return tourismList
    }

    fun mapEntitiesToDomain(input: List<TouristAttractionEntity>): List<TouristAttraction> =
        input.map {
            TouristAttraction(
                touristAttractionId = it.touristAttractionId,
                touristAttractionName = it.touristAttractionName,
                address = it.address,
                districtName = it.districtName,
                image = it.image,
                latitude = it.latitude,
                longitude = it.longitude,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: TouristAttraction) = TouristAttractionEntity(
        touristAttractionId = input.touristAttractionId,
        touristAttractionName = input.touristAttractionName,
        address = input.address,
        districtName = input.districtName,
        image = input.image,
        latitude = input.latitude,
        longitude = input.longitude,
        isFavorite = false
    )
}