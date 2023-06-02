package com.example.luckynumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val luckyNumberTextView = findViewById<TextView>(R.id.luckyNumberTextView)
        val shareButton = findViewById<Button>(R.id.shareBtn)

        luckyNumberTextView.text = generateRandomNumber().toString()

        Toast.makeText(this@LuckyNumberActivity, "hi ${getUserName()}", Toast.LENGTH_LONG)

        shareButton.setOnClickListener{

        }

    }

    private fun getUserName() : String{
        var bundle:Bundle?= intent.extras
        var name = bundle!!.get("name").toString()
        return name
    }

   private fun generateRandomNumber(): Int {
        return Random.nextInt(1000)
    }
}