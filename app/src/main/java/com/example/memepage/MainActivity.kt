package com.example.memepage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnButton:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnButton=findViewById(R.id.btnButton)
        btnButton.setOnClickListener {
            val intent=Intent(this,memetwo::class.java)
            startActivity(intent)
        }
    }
}