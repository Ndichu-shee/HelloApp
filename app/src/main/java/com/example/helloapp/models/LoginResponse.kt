package com.example.helloapp.models

import com.google.gson.annotations.SerializedName

class LoginResponse {

    val studentId: String?

    data class LoginResponse(
        @SerializedName("access_token")var accessToken:String,
        @SerializedName("message")var message:String

    )
}