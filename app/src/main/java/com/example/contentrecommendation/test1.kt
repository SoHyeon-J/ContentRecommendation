package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class test1 : AppCompatActivity() {

    lateinit var upbutton1: Button
    lateinit var downbutton1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)
        upbutton1 = findViewById(R.id.upbutton1)
        downbutton1 = findViewById(R.id.downbutton1)

        upbutton1.setOnClickListener {
            val intent = Intent(this, test2_2::class.java)
            startActivity(intent)
        }

        downbutton1.setOnClickListener {
            val intent = Intent(this, test2::class.java)
            startActivity(intent)
        }
    }
}