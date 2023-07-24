package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class test3_3 : AppCompatActivity() {
    lateinit var upbutton6 : Button
    lateinit var downbutton6 : Button
    override fun onCreate(savedInstanceState: Bundle?) {

        upbutton6 = findViewById(R.id.upbutton6)
        downbutton6 = findViewById(R.id.downbutton6)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test33)
        upbutton6.setOnClickListener {
            var intent = Intent(this, Result_reason::class.java)
            startActivity(intent)
        }

        downbutton6.setOnClickListener {
            var intent = Intent(this, Result_documentary::class.java)
            startActivity(intent)
        }
    }
}