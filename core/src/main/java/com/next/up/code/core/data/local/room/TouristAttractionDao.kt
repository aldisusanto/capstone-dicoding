package com.next.up.code.core.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.next.up.code.core.data.local.entity.TouristAttractionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TouristAttractionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTouristAttraction(tourism: List<TouristAttractionEntity>)

    @Query("SELECT * FROM touristAttractionTable where isFavorite = 1")
    fun getFavoriteAttraction(): Flow<List<TouristAttractionEntity>>

    @Update
    fun updateAttraction(tourism: TouristAttractionEntity)

    @Query("SELECT * FROM touristAttractionTable")
    fun getAllAttraction(): Flow<List<TouristAttractionEntity>>

}