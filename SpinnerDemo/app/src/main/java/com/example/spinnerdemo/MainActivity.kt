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
        spin = findViewById<Spinner>(R.id.spinner)
        imgv=findViewById(R.id.imageView)
        var arrayAdapt = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,fruits)
        spin.adapter  = arrayAdapt
        spin.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(fruits[p2]=="mango"){
                    imgv.setImageResource(R.drawable.one)
                }
                else if(fruits[p2]=="banana"){
                    imgv.setImageResource(R.drawable.two)
                }
                else{
                    imgv.setImageResource(R.drawable.three)
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@MainActivity,"No item selected",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
