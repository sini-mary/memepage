package com.example.memepage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memetwo : AppCompatActivity() {
    lateinit var btnbuttontwo:Button
    lateinit var btnbuttonfour:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memetwo)
        btnbuttontwo=findViewById(R.id.btnbuttontwo)
        btnbuttontwo.setOnClickListener {
            val intent=Intent(
                this,meme3::class.java)
            startActivity(intent)

        }
        btnbuttonfour=findViewById(R.id.btnbuttonfour)
        btnbuttonfour.setOnClickListener {
           val intent= Intent(

               this,MainActivity::class.java
           )
            startActivity(intent)
        }


    }
}