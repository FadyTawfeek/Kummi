package com.example.kummiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_transportation.*

class TransportationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transportation)

        button_bus.setOnClickListener {
            val intent = Intent(applicationContext, BusActivity::class.java)
            startActivity(intent)
        }

        button_train.setOnClickListener {
            val intent = Intent(applicationContext, TrainActivity::class.java)
            startActivity(intent)
        }



    }
}
