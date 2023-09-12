package com.next.up.code.core.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\"\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\"\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H&\u00a8\u0006\u0017"}, d2 = {"Lcom/next/up/code/core/domain/usecase/CoreUseCase;", "", "getAllTouristAttraction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/next/up/code/core/data/Resource;", "", "Lcom/next/up/code/core/domain/model/TouristAttraction;", "getFavoriteTouristAttraction", "getGallery", "Lcom/next/up/code/core/domain/model/GalleryTouristAttraction;", "id", "", "getRent", "Lcom/next/up/code/core/domain/model/Rent;", "getTicket", "Lcom/next/up/code/core/domain/model/Ticket;", "getVideo", "Lcom/next/up/code/core/domain/model/VideoTouristAttraction;", "setFavoriteTouristAttraction", "", "touristAttraction", "state", "", "core_debug"})
public abstract interface CoreUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.TouristAttraction>>> getAllTouristAttraction();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.Ticket>>> getTicket(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.Rent>>> getRent(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.GalleryTouristAttraction>>> getGallery(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.Resource<com.next.up.code.core.domain.model.VideoTouristAttraction>> getVideo(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.next.up.code.core.domain.model.TouristAttraction>> getFavoriteTouristAttraction();
    
    public abstract void setFavoriteTouristAttraction(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.domain.model.TouristAttraction touristAttraction, boolean state);
}