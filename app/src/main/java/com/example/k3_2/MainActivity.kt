package com.example.k3_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val radio1 = findViewById<RadioButton>(R.id.radio1)
        val radio2 = findViewById<RadioButton>(R.id.radio2)
        val button1 = findViewById<Button>(R.id.button1)
        val image1 = findViewById<ImageView>(R.id.imageview1)
        val image2 = findViewById<ImageView>(R.id.imageview2)
        val text2 = findViewById<TextView>(R.id.textview2)
        button1.setOnClickListener {
            if(radio1.isChecked){
                image1.setImageResource(R.drawable.jp3)
                text2.visibility = View.VISIBLE
                text2.text = "Tak pan Jezus powiedzial,\nteraz dawaj na tace"
                image2.visibility = View.VISIBLE
                findViewById<EditText>(R.id.edittext1).visibility = View.VISIBLE
                findViewById<Button>(R.id.button2).visibility = View.VISIBLE
                findViewById<TextView>(R.id.textview3).visibility = View.VISIBLE
            }
            if(radio2.isChecked){
                image1.setImageResource(R.drawable.jp2)
                text2.visibility = View.VISIBLE
                text2.text = "Precz stąd BEZBOŻNIKU"
                image2.visibility = View.VISIBLE
                findViewById<EditText>(R.id.edittext1).visibility = View.INVISIBLE
                findViewById<Button>(R.id.button2).visibility = View.INVISIBLE
                findViewById<TextView>(R.id.textview3).visibility = View.INVISIBLE
            }
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            text2.text = "Bedzie na kremowki"
        }
    }
}