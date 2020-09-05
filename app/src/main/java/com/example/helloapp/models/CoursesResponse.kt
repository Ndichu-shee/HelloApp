package com.example.helloapp.models

import com.google.gson.annotations.SerializedName

data class CoursesResponse(
    @SerializedName("courses") var courses:List<Courses>
)