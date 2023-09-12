package com.next.up.code.core.data.local.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/next/up/code/core/data/local/room/TouristAttractionDao;", "", "getAllAttraction", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/next/up/code/core/data/local/entity/TouristAttractionEntity;", "getFavoriteAttraction", "insertTouristAttraction", "", "tourism", "updateAttraction", "core_debug"})
@androidx.room.Dao
public abstract interface TouristAttractionDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertTouristAttraction(@org.jetbrains.annotations.NotNull
    java.util.List<com.next.up.code.core.data.local.entity.TouristAttractionEntity> tourism);
    
    @androidx.room.Query(value = "SELECT * FROM touristAttractionTable where isFavorite = 1")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.next.up.code.core.data.local.entity.TouristAttractionEntity>> getFavoriteAttraction();
    
    @androidx.room.Update
    public abstract void updateAttraction(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.local.entity.TouristAttractionEntity tourism);
    
    @androidx.room.Query(value = "SELECT * FROM touristAttractionTable")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.next.up.code.core.data.local.entity.TouristAttractionEntity>> getAllAttraction();
}