package com.example.luckynumberapp

import android.content.Intent
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
            shareRandomNumber(getUserName()!!, generateRandomNumber())
        }

    }

    private fun getUserName(): String? {
        var bundle: Bundle? = intent.extras
        return bundle!!.getString("name")
    }

   private fun generateRandomNumber(): Int {
        return Random.nextInt(1000)
    }

    private fun shareRandomNumber(name:String, randomNumber:Int) {
        var shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"$name is a lucky guy or girl. mjfpm")
        shareIntent.putExtra(Intent.EXTRA_TEXT,"his/her lucky number is $randomNumber")
        startActivity(shareIntent)
    }
}