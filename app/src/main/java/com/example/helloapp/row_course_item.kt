package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Course(
    var courseId: String,
    var courseName: String,
    var courseCode: String,
    var instructor: String,
    var description: String
)