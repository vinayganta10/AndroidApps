package com.example.spinnerdemo

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import android.widget.*

class MainActivity : ComponentActivity() {
    lateinit var spin: Spinner
    lateinit var imgv: ImageView
    var fruits = arrayOf("mango", "banana", "apple")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spin = findViewById(R.id.spinner)
        imgv=findViewById(R.id.imageView)
        var arrayAdapt = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,fruits)
        spin.adapter  = arrayAdapt
        spin.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(fruits[position]=="mango"){
                    imgv.setImageResource(R.drawable.one)
                }
                if(fruits[position]=="apple"){
                    imgv.setImageResource(R.drawable.two)
                }
                if(fruits[position]=="banana"){
                    imgv.setImageResource(R.drawable.three)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(applicationContext,"nothing is selected",Toast.LENGTH_SHORT)
            }
        }
    }
}
