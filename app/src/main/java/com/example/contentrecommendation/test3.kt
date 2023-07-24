package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class test3 : AppCompatActivity() {
    lateinit var upbutton4: Button
    lateinit var downbutton4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)

        upbutton4 = findViewById(R.id.upbutton4)
        downbutton4 = findViewById(R.id.upbutton4)

        upbutton4.setOnClickListener {
            var intent = Intent(this, Result_horror::class.java)
            startActivity(intent)
        }

        downbutton4.setOnClickListener {
            var intent = Intent(this, Result_criminal::class.java)
            startActivity(intent)
        }
    }
}