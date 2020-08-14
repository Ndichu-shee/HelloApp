package com.example.helloapp

import com.google.gson.annotations.SerializedName

class LoginResponse {

    data class LoginResponse(
        @SerializedName("access_token")var accessToken:String,
        @SerializedName("message")var message:String

    )
}