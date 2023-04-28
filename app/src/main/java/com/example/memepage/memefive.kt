package com.example.memepage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memefive : AppCompatActivity() {
        lateinit var btnbuttonseven:Button
        @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefive)
            btnbuttonseven=findViewById(R.id.btnbuttonseven)
            btnbuttonseven.setOnClickListener {
                val intent=Intent(
                    this,memefour::class.java
                )
                startActivity(intent)
            }
        }
    }


