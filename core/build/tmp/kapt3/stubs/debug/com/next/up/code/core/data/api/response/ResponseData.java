package com.next.up.code.core.data.api.response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\u000e\u0010\u0012\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001R\u0018\u0010\u0007\u001a\u00028\u00008\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/next/up/code/core/data/api/response/ResponseData;", "T", "", "message", "", "success", "", "data", "(Ljava/lang/String;ZLjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/Object;)Lcom/next/up/code/core/data/api/response/ResponseData;", "equals", "other", "hashCode", "", "toString", "core_debug"})
public final class ResponseData<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    private final boolean success = false;
    @com.google.gson.annotations.SerializedName(value = "Data")
    private final T data = null;
    
    public ResponseData(@org.jetbrains.annotations.NotNull
    java.lang.String message, boolean success, T data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final T component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.next.up.code.core.data.api.response.ResponseData<T> copy(@org.jetbrains.annotations.NotNull
    java.lang.String message, boolean success, T data) {
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