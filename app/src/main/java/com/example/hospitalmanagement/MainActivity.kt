package com.example.hospitalmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appointment_button = findViewById(R.id.fab_button) as Button

        appointment_button.setOnClickListener {
            startActivity(Intent(this@MainActivity, Appointment_Activity::class.java))
        }
    }
}
