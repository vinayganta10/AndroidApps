package com.example.intentactivity

import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.*
import android.content.Intent

class MainActivity2 : ComponentActivity() {
    private lateinit var result:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        println("djhf")
        result = findViewById(R.id.textView)
        val intent:Intent = intent
        var user = intent.getStringExtra("Username")
        var pass = intent.getStringExtra("Password")
        result.text = user + " " +pass
    }
}