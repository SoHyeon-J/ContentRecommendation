package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class test2 : AppCompatActivity() {

    lateinit var upbutton2: Button
    lateinit var downbutton2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

        upbutton2 = findViewById(R.id.upbutton2)
        downbutton2 = findViewById(R.id.upbutton2)

        upbutton2.setOnClickListener {
            var intent = Intent(this, test3_3::class.java)
            startActivity(intent)
        }

        downbutton2.setOnClickListener {
            var intent = Intent(this, test3::class.java)
            startActivity(intent)
        }
    }
}