package com.next.up.code.capstone.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lcom/next/up/code/capstone/ui/home/HomeFragment;", "Lcom/inyongtisto/myhelper/base/BaseFragment;", "()V", "_binding", "Lcom/next/up/code/capstone/databinding/FragmentHomeBinding;", "attractionItems", "Ljava/util/ArrayList;", "Lcom/next/up/code/core/domain/model/TouristAttraction;", "binding", "getBinding", "()Lcom/next/up/code/capstone/databinding/FragmentHomeBinding;", "filterAttractionItem", "root", "Landroid/view/View;", "viewModel", "Lcom/next/up/code/capstone/ui/home/HomeViewModel;", "getViewModel", "()Lcom/next/up/code/capstone/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "searchTouristAttraction", "keyword", "", "setTouristAttraction", "setupListener", "adapter", "Lcom/next/up/code/core/adapter/TouristAttractionAdapter;", "setupSearch", "app_debug"})
public final class HomeFragment extends com.inyongtisto.myhelper.base.BaseFragment {
    @org.jetbrains.annotations.Nullable
    private com.next.up.code.capstone.databinding.FragmentHomeBinding _binding;
    @org.jetbrains.annotations.Nullable
    private android.view.View root;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.next.up.code.core.domain.model.TouristAttraction> filterAttractionItem;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.next.up.code.core.domain.model.TouristAttraction> attractionItems;
    
    public HomeFragment() {
        super();
    }
    
    private final com.next.up.code.capstone.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final com.next.up.code.capstone.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setTouristAttraction() {
    }
    
    private final void setupSearch() {
    }
    
    private final void searchTouristAttraction(java.lang.String keyword) {
    }
    
    private final void setupListener(com.next.up.code.core.adapter.TouristAttractionAdapter adapter) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}