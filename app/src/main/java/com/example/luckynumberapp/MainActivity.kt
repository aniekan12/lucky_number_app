package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextName = findViewById<TextView>(R.id.editTextPersonName)
        val generateButton = findViewById<Button>(R.id.generateBtn)

        var name = editTextName.text

        generateButton.setOnClickListener{
            intent = Intent(this@MainActivity, LuckyNumberActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}