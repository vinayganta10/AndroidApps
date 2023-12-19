package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    private lateinit var b:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b = findViewById(R.id.button)
        b.setOnClickListener{
            rollDice()
        }
    }
    private fun rollDice(){
        var dice = Dice(6)
        var diceRoll = dice.roll()
        val imgv:ImageView = findViewById(R.id.imageView)
        var drawableResource = when(diceRoll){
            1->R.drawable.one
            2->R.drawable.two
            3->R.drawable.three
            4->R.drawable.four
            5->R.drawable.five
            else->R.drawable.six
        }
        imgv.setImageResource(drawableResource)
    }
}

class Dice(private var sides:Int){
    fun roll():Int{
        return (1..sides).random()
    }
}