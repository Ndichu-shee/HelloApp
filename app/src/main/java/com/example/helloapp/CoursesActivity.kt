package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_courses.*
import kotlinx.android.synthetic.main.row_course_item.*

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        var courseList = listOf<Course>(
            Course("2", "Android", "303", "Jane", "lists"),
            Course("4", "Electronics", "304", "Janet", "Arduino"),
            Course("6", "Python", "305", "Juliet", "classes and objects"),
            Course("10", "Java", "306", "Joy", "mobile dev"),
            Course("12", "C++", "307", "James", "Arrays"),
            Course("14", "Ruby", "308", "Ann", "classes"),
            Course("16", "C", "309", "Sharon", "algorithms"),
            Course("18", "Design", "310", "Ben", "position")


        )
        tvCourses.layoutManager = LinearLayoutManager(baseContext)
        tvCourses.adapter = CoursesAdapter(courseList)
    }
}