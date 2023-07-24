package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class test4 : AppCompatActivity() {

    lateinit var upbutton7 :Button
    lateinit var downbutton7 : Button
    override fun onCreate(savedInstanceState: Bundle?) {

        upbutton7 = findViewById(R.id.upbutton7)
        downbutton7 = findViewById(R.id.downbutton7)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test4)

        upbutton7.setOnClickListener {
            var intent = Intent(this, Result_romance::class.java)
            startActivity(intent)
        }

        downbutton7.setOnClickListener {
            var intent = Intent(this, Result_comedy::class.java)
            startActivity(intent)
        }
    }
}