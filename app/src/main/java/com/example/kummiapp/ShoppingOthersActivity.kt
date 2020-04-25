package com.example.kummiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shopping_others.*

class ShoppingOthersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_others)


        button1.setOnClickListener {
            val intent = Intent(applicationContext, ClothesActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(applicationContext, AppliancesActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(applicationContext, BikesActivity::class.java)
            startActivity(intent)
        }

    }
}
