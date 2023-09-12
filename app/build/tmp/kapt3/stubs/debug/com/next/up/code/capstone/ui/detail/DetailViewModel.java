package com.next.up.code.capstone.ui.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/next/up/code/capstone/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "coreUseCase", "Lcom/next/up/code/core/domain/usecase/CoreUseCase;", "(Lcom/next/up/code/core/domain/usecase/CoreUseCase;)V", "getGallery", "Landroidx/lifecycle/LiveData;", "Lcom/next/up/code/core/data/Resource;", "", "Lcom/next/up/code/core/domain/model/GalleryTouristAttraction;", "id", "", "getRent", "Lcom/next/up/code/core/domain/model/Rent;", "getTicket", "Lcom/next/up/code/core/domain/model/Ticket;", "getVideo", "Lcom/next/up/code/core/domain/model/VideoTouristAttraction;", "setFavoriteTouristAttraction", "", "touristAttraction", "Lcom/next/up/code/core/domain/model/TouristAttraction;", "newStatus", "", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.domain.usecase.CoreUseCase coreUseCase = null;
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.domain.usecase.CoreUseCase coreUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.Ticket>>> getTicket(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.Rent>>> getRent(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.next.up.code.core.data.Resource<java.util.List<com.next.up.code.core.domain.model.GalleryTouristAttraction>>> getGallery(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.next.up.code.core.data.Resource<com.next.up.code.core.domain.model.VideoTouristAttraction>> getVideo(int id) {
        return null;
    }
    
    public final void setFavoriteTouristAttraction(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.domain.model.TouristAttraction touristAttraction, boolean newStatus) {
    }
}