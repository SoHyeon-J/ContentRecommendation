package com.example.contentrecommendation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var mainStartbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainStartbtn = findViewById(R.id.mainStartBtn)

        mainStartbtn.setOnClickListener{
            var intent = Intent(this, test1::class.java)
            startActivity(intent)
        }


    }
}