package com.example.kummiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shopping2.*

class Shopping2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping2)

        button9.setOnClickListener {
            val intent = Intent(applicationContext, GroceriesActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(applicationContext, ShoppingOthersActivity::class.java)
            startActivity(intent)
        }


    }
}
