package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var mainStartBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainStartBtn = findViewById(R.id.mainStartBtn)

        mainStartBtn.setOnClickListener {
            var intent = Intent(this, test1::class.java )
            startActivity(intent)
        }
    }
}