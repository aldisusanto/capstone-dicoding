package com.next.up.code.core.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00070\u0006J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/next/up/code/core/data/api/ApiDataSource;", "", "apiService", "Lcom/next/up/code/core/data/api/network/ApiService;", "(Lcom/next/up/code/core/data/api/network/ApiService;)V", "getGalleryTouristAttraction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/next/up/code/core/data/api/network/ApiResponse;", "", "Lcom/next/up/code/core/data/api/response/item/GalleryTouristAttractionItem;", "id", "", "getRent", "Lcom/next/up/code/core/data/api/response/item/RentItem;", "getTicket", "Lcom/next/up/code/core/data/api/response/item/TicketItem;", "getTouristAttraction", "Lcom/next/up/code/core/data/api/response/item/TouristAttractionItem;", "getVideoTouristAttraction", "Lcom/next/up/code/core/data/api/response/item/VideoTouristAttractionItem;", "core_debug"})
public final class ApiDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.data.api.network.ApiService apiService = null;
    
    public ApiDataSource(@org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.api.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.api.network.ApiResponse<java.util.List<com.next.up.code.core.data.api.response.item.TouristAttractionItem>>> getTouristAttraction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.api.network.ApiResponse<java.util.List<com.next.up.code.core.data.api.response.item.TicketItem>>> getTicket(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.api.network.ApiResponse<java.util.List<com.next.up.code.core.data.api.response.item.RentItem>>> getRent(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.api.network.ApiResponse<java.util.List<com.next.up.code.core.data.api.response.item.GalleryTouristAttractionItem>>> getGalleryTouristAttraction(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.next.up.code.core.data.api.network.ApiResponse<com.next.up.code.core.data.api.response.item.VideoTouristAttractionItem>> getVideoTouristAttraction(int id) {
        return null;
    }
}