package com.example.startandstop

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.startandstop.ui.theme.StartAndStopTheme

class MainActivity : ComponentActivity() {
    private lateinit var b1:Button
    private lateinit var b2:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1 = findViewById(R.id.button1)
        b2 = findViewById(R.id.button2)
        b1.setOnClickListener{
            Toast.makeText(this,"start clicked",Toast.LENGTH_SHORT).show()
        }
        b2.setOnClickListener{
            Toast.makeText(this,"stop clicked",Toast.LENGTH_SHORT).show()
        }
    }
}

