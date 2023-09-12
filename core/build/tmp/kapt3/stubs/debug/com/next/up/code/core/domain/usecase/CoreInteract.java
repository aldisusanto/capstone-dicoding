package com.next.up.code.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\"\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/next/up/code/core/domain/usecase/CoreInteract;", "Lcom/next/up/code/core/domain/usecase/CoreUseCase;", "coreRepository", "Lcom/next/up/code/core/domain/repository/ICoreRepository;", "(Lcom/next/up/code/core/domain/repository/ICoreRepository;)V", "getAllTouristAttraction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/next/up/code/core/data/Resource;", "", "Lcom/next/up/code/core/domain/model/TouristAttraction;", "getFavoriteTouristAttraction", "getGallery", "Lcom/next/up/code/core/domain/model/GalleryTouristAttraction;", "id", "", "getRent", "Lcom/next/up/code/core/domain/model/Rent;", "getTicket", "Lcom/next/up/code/core/domain/model/Ticket;", "getVideo", "Lcom/next/up/code/core/domain/model/VideoTouristAttraction;", "setFavoriteTouristAttraction", "", "touristAttraction", "state", "", "core_debug"})
public final class CoreInteract implements com.next.up.code.core.domain.usecase.CoreUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.domain.repository.ICoreRepository coreRepository = null;
    
    public CoreInteract(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.domain.repository.ICoreRepository coreRepository) {
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