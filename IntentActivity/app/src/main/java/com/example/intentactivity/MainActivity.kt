package com.example.intentactivity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var username: EditText
    private lateinit var password:EditText
    private lateinit var b:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.one)
        password = findViewById(R.id.two)
        b = findViewById(R.id.button)
        b.setOnClickListener{
            if (username.text.toString() == "cvr" && password.text.toString() == "cvr"){
//                val intent = Intent(this,MainActivity2::class.java)
//                intent.putExtra("Username",username.text.toString())
//                intent.putExtra("Password",password.text.toString())
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
                startActivity(intent)
                Toast.makeText(this,"Login success",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Error login",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

