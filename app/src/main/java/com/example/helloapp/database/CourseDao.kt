package com.example.helloapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ke.co.hello.models.Course
import retrofit2.http.Query


interface CourseDao {

    @Dao
    interface CourseDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertCourse(course: Course)

        @Query("SELECT * FROM courses")
        fun getAllCourses(): List<Course>
    }
}