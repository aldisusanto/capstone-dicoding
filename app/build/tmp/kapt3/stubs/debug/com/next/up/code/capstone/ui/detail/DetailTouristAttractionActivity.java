package com.next.up.code.capstone.ui.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020 H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/next/up/code/capstone/ui/detail/DetailTouristAttractionActivity;", "Lcom/inyongtisto/myhelper/base/BaseActivity;", "()V", "_binding", "Lcom/next/up/code/capstone/databinding/ActivityDetailTouristAttractionBinding;", "binding", "getBinding", "()Lcom/next/up/code/capstone/databinding/ActivityDetailTouristAttractionBinding;", "root", "Landroid/view/View;", "viewModel", "Lcom/next/up/code/capstone/ui/detail/DetailViewModel;", "getViewModel", "()Lcom/next/up/code/capstone/ui/detail/DetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "youTubePlayer", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setFavorite", "isFavorite", "", "setGallery", "id", "", "setRent", "setTicket", "setTouristAttraction", "touristAttraction", "Lcom/next/up/code/core/domain/model/TouristAttraction;", "setVideo", "setupMainButton", "touristAttractionItem", "app_debug"})
public final class DetailTouristAttractionActivity extends com.inyongtisto.myhelper.base.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.next.up.code.capstone.databinding.ActivityDetailTouristAttractionBinding _binding;
    @org.jetbrains.annotations.Nullable
    private android.view.View root;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView youTubePlayer;
    
    public DetailTouristAttractionActivity() {
        super();
    }
    
    private final com.next.up.code.capstone.databinding.ActivityDetailTouristAttractionBinding getBinding() {
        return null;
    }
    
    private final com.next.up.code.capstone.ui.detail.DetailViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupMainButton(com.next.up.code.core.domain.model.TouristAttraction touristAttractionItem) {
    }
    
    private final void setTouristAttraction(com.next.up.code.core.domain.model.TouristAttraction touristAttraction) {
    }
    
    private final void setTicket(int id) {
    }
    
    private final void setRent(int id) {
    }
    
    private final void setVideo(int id) {
    }
    
    private final void setGallery(int id) {
    }
    
    private final void setFavorite(boolean isFavorite) {
    }
}