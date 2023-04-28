package com.example.memepage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memefour : AppCompatActivity() {
    lateinit var btnbuttonfive:Button
    lateinit var btnbuttonsix:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefour)
        btnbuttonfive=findViewById(R.id.btnbuttonfive)
        btnbuttonfive.setOnClickListener {
            val intent=Intent(this,memefive::class.java)
            startActivity(intent)
        }
        btnbuttonsix=findViewById(R.id.btnbuttonsix)
        btnbuttonsix.setOnClickListener {
            val intent=Intent(this,meme3::class.java)
            startActivity(intent)
        }


    }

}