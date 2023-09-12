package com.next.up.code.core.data.local

import com.next.up.code.core.data.local.entity.TouristAttractionEntity
import com.next.up.code.core.data.local.room.TouristAttractionDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val touristAttractionDao: TouristAttractionDao) {
    fun insertTouristAttraction(touristAttractionList: List<TouristAttractionEntity>) =
        touristAttractionDao.insertTouristAttraction(touristAttractionList)

    fun getAllTouristAttraction(): Flow<List<TouristAttractionEntity>> =
        touristAttractionDao.getAllAttraction()

    fun getFavoriteTouristAttraction(): Flow<List<TouristAttractionEntity>> =
        touristAttractionDao.getFavoriteAttraction()

    fun setFavoriteTourism(tourism: TouristAttractionEntity, newState: Boolean) {
        tourism.isFavorite = newState
        touristAttractionDao.updateAttraction(tourism)
    }
}