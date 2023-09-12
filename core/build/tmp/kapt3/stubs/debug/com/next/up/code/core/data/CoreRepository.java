package com.next.up.code.core.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0016J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/next/up/code/core/data/CoreRepository;", "Lcom/next/up/code/core/domain/repository/ICoreRepository;", "apiDataSource", "Lcom/next/up/code/core/data/api/ApiDataSource;", "localDataSource", "Lcom/next/up/code/core/data/local/LocalDataSource;", "appExecutors", "Lcom/next/up/code/core/utils/AppExecutors;", "(Lcom/next/up/code/core/data/api/ApiDataSource;Lcom/next/up/code/core/data/local/LocalDataSource;Lcom/next/up/code/core/utils/AppExecutors;)V", "getAllTouristAttraction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/next/up/code/core/data/Resource;", "", "Lcom/next/up/code/core/domain/model/TouristAttraction;", "getFavoriteTouristAttraction", "getGallery", "Lcom/next/up/code/core/domain/model/GalleryTouristAttraction;", "id", "", "getRent", "Lcom/next/up/code/core/domain/model/Rent;", "getTicket", "Lcom/next/up/code/core/domain/model/Ticket;", "getVideo", "Lcom/next/up/code/core/domain/model/VideoTouristAttraction;", "setFavoriteTouristAttraction", "", "touristAttraction", "state", "", "core_debug"})
public final class CoreRepository implements com.next.up.code.core.domain.repository.ICoreRepository {
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.data.api.ApiDataSource apiDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.data.local.LocalDataSource localDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.utils.AppExecutors appExecutors = null;
    
    public CoreRepository(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.api.ApiDataSource apiDataSource, @org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull
    com.next.up.code.core.utils.AppExecutors appExecutors) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.TouristAttraction>>> getAllTouristAttraction() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.Ticket>>> getTicket(int id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.Rent>>> getRent(int id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.GalleryTouristAttraction>>> getGallery(int id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<com.next.up.code.core.domain.model.VideoTouristAttraction>> getVideo(int id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.next.up.code.core.domain.model.TouristAttraction>> getFavoriteTouristAttraction() {
        return null;
    }
    
    @java.lang.Override
    public void setFavoriteTouristAttraction(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.domain.model.TouristAttraction touristAttraction, boolean state) {
    }
}