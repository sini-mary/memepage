package com.example.memepage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme3 : AppCompatActivity() {
    lateinit var btnbuttonfour:Button
    lateinit var btnbuttonten:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        btnbuttonfour=findViewById(R.id.btnbuttonfour)
        btnbuttonfour.setOnClickListener {
            val intent=Intent(this,memefour::class.java)
            startActivity(intent)
        }
        btnbuttonten=findViewById(R.id.btnbuttonten)
        btnbuttonten.setOnClickListener {
            val intent= Intent (this,memetwo::class.java)
            startActivity(intent)
        }
    }
}