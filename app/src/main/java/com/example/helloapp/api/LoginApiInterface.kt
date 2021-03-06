package com.example.helloapp.api

import com.example.helloapp.models.LoginResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiInterface {
    interface LoginApiInterface {
        @POST("login")
        fun loginStudent(@Body requestBody: RequestBody): Call<LoginResponse>
    }
}