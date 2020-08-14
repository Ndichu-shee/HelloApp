package com.example.helloapp

import com.google.gson.annotations.SerializedName

class RegistrationResponse {
    data class RegistrationResponse(
        @SerializedName("message") var message: String,
        @SerializedName("student") var student: Student
    )
}