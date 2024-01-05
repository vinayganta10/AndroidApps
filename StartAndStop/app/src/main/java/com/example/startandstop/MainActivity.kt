package com.example.startandstop

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var b1:Button
    private lateinit var b2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2)
        b1.setOnClickListener{
            Toast.makeText(this,"Start clicked()",Toast.LENGTH_SHORT).show()
        }
        b2.setOnClickListener{
            Toast.makeText(this,"Stop clicked()",Toast.LENGTH_SHORT).show()
        }
    }
}

