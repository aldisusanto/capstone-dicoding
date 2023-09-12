package com.next.up.code.core.data.api.response.item;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006&"}, d2 = {"Lcom/next/up/code/core/data/api/response/item/TouristAttractionItem;", "", "id", "", "touristAttractionName", "", "upt", "address", "coordinate", "Lcom/next/up/code/core/data/api/response/item/CoordinateItem;", "thumbnail", "districtItem", "Lcom/next/up/code/core/data/api/response/item/DistrictItem;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/next/up/code/core/data/api/response/item/CoordinateItem;Ljava/lang/String;Lcom/next/up/code/core/data/api/response/item/DistrictItem;)V", "getAddress", "()Ljava/lang/String;", "getCoordinate", "()Lcom/next/up/code/core/data/api/response/item/CoordinateItem;", "getDistrictItem", "()Lcom/next/up/code/core/data/api/response/item/DistrictItem;", "getId", "()I", "getThumbnail", "getTouristAttractionName", "getUpt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "core_debug"})
public final class TouristAttractionItem {
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "nama_objek_wisata")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String touristAttractionName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String upt = null;
    @com.google.gson.annotations.SerializedName(value = "alamat")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String address = null;
    @com.google.gson.annotations.SerializedName(value = "koordinat")
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.data.api.response.item.CoordinateItem coordinate = null;
    @com.google.gson.annotations.SerializedName(value = "gambar")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String thumbnail = null;
    @com.google.gson.annotations.SerializedName(value = "kabupaten")
    @org.jetbrains.annotations.NotNull
    private final com.next.up.code.core.data.api.response.item.DistrictItem districtItem = null;
    
    public TouristAttractionItem(int id, @org.jetbrains.annotations.NotNull
    java.lang.String touristAttractionName, @org.jetbrains.annotations.NotNull
    java.lang.String upt, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.api.response.item.CoordinateItem coordinate, @org.jetbrains.annotations.NotNull
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.api.response.item.DistrictItem districtItem) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTouristAttractionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUpt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.next.up.code.core.data.api.response.item.CoordinateItem getCoordinate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.next.up.code.core.data.api.response.item.DistrictItem getDistrictItem() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.next.up.code.core.data.api.response.item.CoordinateItem component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.next.up.code.core.data.api.response.item.DistrictItem component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.next.up.code.core.data.api.response.item.TouristAttractionItem copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String touristAttractionName, @org.jetbrains.annotations.NotNull
    java.lang.String upt, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.api.response.item.CoordinateItem coordinate, @org.jetbrains.annotations.NotNull
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull
    com.next.up.code.core.data.api.response.item.DistrictItem districtItem) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}