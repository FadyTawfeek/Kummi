package com.example.kummiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*


class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        button1.setOnClickListener {
            val intent = Intent(applicationContext, Shopping2Activity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(applicationContext, FinanceActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(applicationContext, AdministrativeServicesActivity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(applicationContext, TransportationActivity::class.java)
            startActivity(intent)
        }

    }
}
