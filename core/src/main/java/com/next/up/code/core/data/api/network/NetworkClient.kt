package com.next.up.code.core.data.api.network

import com.next.up.code.core.BuildConfig
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkClient {
    companion object {
        fun getApiService(): ApiService {
            val hostname = "sisfodisbudpar.elayanan.info"
            val certificatePinner = CertificatePinner.Builder()
                .add(hostname, "sha256/0r547+og1+GMeasFDilD+YdL2L+EA9jMUWrgrTUKQ70=")
                .add(hostname, "sha256/jQJTbIh0grw0/1TkHSumWb+Fs0Ggogr621gT3PvPKG0=")
                .add(hostname, "sha256/C5+lpZ7tcVwmwQIMcRtPbsQtWLABXhQzejna0wHFr8M=")
                .build()

            val loggingInterceptor = if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            } else {
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE)
            }

            val client = OkHttpClient.Builder()
                .certificatePinner(certificatePinner)
                .addInterceptor(loggingInterceptor)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            return retrofit.create(ApiService::class.java)
        }


    }
}