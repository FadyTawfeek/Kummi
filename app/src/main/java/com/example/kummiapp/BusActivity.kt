package com.example.kummiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bus.*

class BusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus)

        button_local.setOnClickListener {
            val intent = Intent(applicationContext, LocalBusActivity::class.java)
            startActivity(intent)
        }

        button_city.setOnClickListener {
            val intent = Intent(applicationContext, IntercityBusActivity::class.java)
            startActivity(intent)
        }



    }
}
