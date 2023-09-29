package com.example.practice13_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun result(view: View){
        val textViewGip: TextView = findViewById(R.id.gipRes)
        val textViewPer: TextView = findViewById(R.id.perRes)
        val textViewPloshad: TextView = findViewById(R.id.ploshadRes)
        val editTextKatet1: EditText = findViewById(R.id.katet1)
        val editTextKatet2: EditText = findViewById(R.id.katet2)
        if(editTextKatet2.text.toString() != "" && editTextKatet1.text.toString() != "") {
            val a: String = editTextKatet2.text.toString()
            val b: String = editTextKatet1.text.toString()
            val gip: Double = sqrt((a.toDouble()).pow(2) + (b.toDouble()).pow(2))
            val per: Double = a.toDouble()+b.toDouble()+gip
            val ploshad:Double= (a.toDouble()*b.toDouble())/2
            textViewGip.text = "$gip"
            textViewPer.text = "$per"
            textViewPloshad.text = "$ploshad"
        }
        else if(editTextKatet2.text.toString() != "" && editTextKatet1.text.toString() == ""){
            val checkDataToast = Toast.makeText(this, "Введите первый катет", Toast.LENGTH_SHORT)
            checkDataToast.show()
        }
        else if(editTextKatet2.text.toString() == "" && editTextKatet1.text.toString() != ""){
            val checkDataToast2 = Toast.makeText(this, "Введите второй катет", Toast.LENGTH_SHORT)
            checkDataToast2.show()
        }
        else{
            val checkDataToast3 = Toast.makeText(this, "Введите катеты", Toast.LENGTH_SHORT)
            checkDataToast3.show()
        }
    }

}