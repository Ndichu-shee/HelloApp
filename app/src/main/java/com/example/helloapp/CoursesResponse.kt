package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.annotations.SerializedName

data class CoursesResponse(
    @SerializedName("courses") var courses:List<Courses>
)