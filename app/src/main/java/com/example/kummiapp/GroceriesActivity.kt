package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_groceries.*

class GroceriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groceries)

        button5.setOnClickListener {
            val intent = Intent(applicationContext, PrismaActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(applicationContext, LidlActivity::class.java)
            startActivity(intent)
        }

        button27.setOnClickListener {
            val intent = Intent(applicationContext, KsupermarketActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(applicationContext, TokmanniActivity::class.java)
            startActivity(intent)
        }

        button_groceries_more_info.setOnClickListener {
            val intent = Intent(applicationContext, GroceriesOthersActivity::class.java)
            startActivity(intent)
        }

        button_groceries_more_info.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "http://oulu.finland.afabuloustrip.com/loc/3-122/shopping-places/"))
            startActivity(intent)
        }

    }
}
