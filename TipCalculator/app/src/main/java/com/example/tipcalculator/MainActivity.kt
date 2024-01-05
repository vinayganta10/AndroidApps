package com.example.tipcalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.tipcalculator.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener() {
            calculateTip()
        }
    }

    fun calculateTip(){
        var cost = (binding.editTextText.text.toString()).toDouble()
        var selected = binding.radioGroup.checkedRadioButtonId
        val tip = when(selected){
            R.id.radioButton->0.15
            R.id.radioButton2->0.1
            else->0.05
        }
        var tipped = cost*tip
        if(binding.switch1.isChecked){
            cost = cost+tipped
            Toast.makeText(this,"$cost tip",Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,"$cost tip",Toast.LENGTH_SHORT).show()
        }
    }
}
