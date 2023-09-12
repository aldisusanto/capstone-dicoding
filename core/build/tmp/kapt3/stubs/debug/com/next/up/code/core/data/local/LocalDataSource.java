package com.next.up.code.core.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/next/up/code/core/data/local/LocalDataSource;", "", "touristAttractionDao", "Lcom/next/up/code/core/data/local/room/TouristAttractionDao;", "(Lcom/next/up/code/core/data/local/room/TouristAttractionDao;)V", "getAllTouristAttraction", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/next/up/code/core/data/local/entity/TouristAttractionEntity;", "getFavoriteTouristAttraction", "insertTouristAttraction", "", "touristAttractionList", "setFavoriteTourism", "tourism", "newState", "", "core_debug"})
public final class LocalDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.data.local.room.TouristAttractionDao touristAttractionDao = null;
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.local.room.TouristAttractionDao touristAttractionDao) {
        super();
    }
    
    public final void insertTouristAttraction(@org.jetbrains.annotations.NotNull
    java.util.List<com.next.up.code.core.data.local.entity.TouristAttractionEntity> touristAttractionList) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.next.up.code.core.data.local.entity.TouristAttractionEntity>> getAllTouristAttraction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.next.up.code.core.data.local.entity.TouristAttractionEntity>> getFavoriteTouristAttraction() {
        return null;
    }
    
    public final void setFavoriteTourism(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.local.entity.TouristAttractionEntity tourism, boolean newState) {
    }
}