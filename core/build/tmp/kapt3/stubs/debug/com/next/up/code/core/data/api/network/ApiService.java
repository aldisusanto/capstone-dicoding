package com.next.up.code.core.data.api.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/next/up/code/core/data/api/network/ApiService;", "", "getGalleryTouristAttraction", "Lcom/next/up/code/core/data/api/response/ResponseData;", "", "Lcom/next/up/code/core/data/api/response/item/GalleryTouristAttractionItem;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRent", "Lcom/next/up/code/core/data/api/response/item/RentItem;", "getTicket", "Lcom/next/up/code/core/data/api/response/item/TicketItem;", "getTouristAttraction", "Lcom/next/up/code/core/data/api/response/item/TouristAttractionItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoTouristAttraction", "Lcom/next/up/code/core/data/api/response/item/VideoTouristAttractionItem;", "core_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "objek-wisata")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTouristAttraction(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.next.up.code.core.data.api.response.ResponseData<java.util.List<com.next.up.code.core.data.api.response.item.TouristAttractionItem>>> $completion);
    
    @retrofit2.http.GET(value = "karcis/objek-wisata/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTicket(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.next.up.code.core.data.api.response.ResponseData<java.util.List<com.next.up.code.core.data.api.response.item.TicketItem>>> $completion);
    
    @retrofit2.http.GET(value = "galeri-foto/objek-wisata/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGalleryTouristAttraction(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.next.up.code.core.data.api.response.ResponseData<java.util.List<com.next.up.code.core.data.api.response.item.GalleryTouristAttractionItem>>> $completion);
    
    @retrofit2.http.GET(value = "galeri-video/objek-wisata/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getVideoTouristAttraction(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.next.up.code.core.data.api.response.ResponseData<com.next.up.code.core.data.api.response.item.VideoTouristAttractionItem>> $completion);
    
    @retrofit2.http.GET(value = "sewa-tempat/objek-wisata/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRent(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.next.up.code.core.data.api.response.ResponseData<java.util.List<com.next.up.code.core.data.api.response.item.RentItem>>> $completion);
}