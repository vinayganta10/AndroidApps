package com.example.tipcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.tipcalculator.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(){
            calculateTip()
        }
    }
    fun calculateTip()
    {
        val cost=(binding.cost.text.toString()).toDouble()
        val selected=binding.radioGroup.checkedRadioButtonId
        val tipPercent = when(selected){
            R.id.radioButton->0.15
            R.id.radioButton2->0.18
            else->0.2
        }
        var tip = tipPercent*cost
        if(binding.switch1.isSelected){
            tip = kotlin.math.ceil(tip)
        }
        binding.textView.text = tip.toString()
    }
}
