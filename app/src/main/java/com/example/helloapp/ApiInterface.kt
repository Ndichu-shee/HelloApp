package com.example.helloapp

import okhttp3.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST( ApiInterface)
    fun registerStudent(Body request: Body): Call<RegistrationResponse>

    @Get ("courses")
    fun getCourses(@Header "authorization" accessToken:String):Call<CoursesResponse>

}