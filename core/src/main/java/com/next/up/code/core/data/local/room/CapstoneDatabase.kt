package com.next.up.code.core.data.local.room

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Database
import androidx.room.RoomDatabase
import com.next.up.code.core.data.local.entity.TouristAttractionEntity


@Database(
    entities = [TouristAttractionEntity::class],
    version = 1,
    exportSchema = false
)
abstract class CapstoneDatabase : RoomDatabase(), Parcelable {


    abstract fun touristAttractionDao(): TouristAttractionDao


    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

}