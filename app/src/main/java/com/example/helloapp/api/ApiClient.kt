package com.example.helloapp.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    fun buildService(java: Class<ApiInterface>): Any {

    }

    object ApiClient {
        var client = OkHttpClient.Builder().build()

        var retrofit = Retrofit.Builder()
            .baseUrl("https://courses-service.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        fun <T> buildService(service: Class<T>): T {
            return retrofit.create(service)
        }

    }

}