package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class test2_2 : AppCompatActivity() {
    lateinit var upbutton3: Button
    lateinit var downbutton3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test22)

        upbutton3 = findViewById(R.id.upbutton3)
        downbutton3 = findViewById(R.id.downbutton3)

        upbutton3.setOnClickListener {
            var intent = Intent(this, test3_2::class.java)
            startActivity(intent)
        }

        downbutton3.setOnClickListener {
            var intent = Intent(this, test4::class.java)
            startActivity(intent)
        }
    }
}