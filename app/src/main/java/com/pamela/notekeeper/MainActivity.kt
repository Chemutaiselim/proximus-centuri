package com.pamela.notekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)


        /*
        on the oncreate method is where we do most of the UI initializations
        Context is used to indicate creation state of certain kinds of Android Classes.
        anytime a class or a method needs a context, we just pass in the activity's this reference
        Built in Layouts are contained in an android class i.e. android.R.layout
         */

        val dm= DataManager()
        val adapterCourses=ArrayAdapter<CourseInfo>(this,
                android.R.layout.simple_spinner_item,
                dm.courses.values.toList())
        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerCourses.adapter=adapterCourses
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
}