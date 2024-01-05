package com.example.intentactivity

import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : ComponentActivity() {
    private lateinit var result:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        result = findViewById(R.id.textView)
        val user = intent.getStringExtra("username")
        val pass = intent.getStringExtra("password")
        result.setText(user+" "+pass)
    }
}