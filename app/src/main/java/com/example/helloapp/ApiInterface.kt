package com.example.helloapp

import okhttp3.Call
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST( ApiInterface)
    fun registerStudent(@Body request: Body): Call<RegistrationResponse>

    @POST("login")
            fun loginStudent(@Body requestBody : RequestBody):Call<LoginResponse>)


    @Get ("Courses")
    fun getCourses(@Header "authorization") accessToken:String:Call<CoursesResponse>

}