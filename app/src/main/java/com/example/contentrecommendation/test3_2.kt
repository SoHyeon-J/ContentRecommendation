package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class test3_2 : AppCompatActivity() {
    lateinit var upbutton5: Button
    lateinit var downbutton5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test32)

        upbutton5 = findViewById(R.id.upbutton5)
        downbutton5 = findViewById(R.id.upbutton5)

        upbutton5.setOnClickListener {
            var intent = Intent(this, Result_animation::class.java)
            startActivity(intent)
        }

        downbutton5.setOnClickListener {
            var intent = Intent(this, Result_fantasy::class.java)
            startActivity(intent)
        }
    }
}