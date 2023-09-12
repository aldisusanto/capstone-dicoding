package com.next.up.code.core.data.local.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/next/up/code/core/data/local/room/CapstoneDatabase;", "Landroidx/room/RoomDatabase;", "Landroid/os/Parcelable;", "()V", "describeContents", "", "touristAttractionDao", "Lcom/next/up/code/core/data/local/room/TouristAttractionDao;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_debug"})
@androidx.room.Database(entities = {com.next.up.code.core.data.local.entity.TouristAttractionEntity.class}, version = 1, exportSchema = false)
public abstract class CapstoneDatabase extends androidx.room.RoomDatabase implements android.os.Parcelable {
    
    public CapstoneDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.next.up.code.core.data.local.room.TouristAttractionDao touristAttractionDao();
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
}