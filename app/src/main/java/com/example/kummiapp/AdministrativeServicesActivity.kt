package com.example.kummiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_administrative_services.*

class AdministrativeServicesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrative_services)

        button1.setOnClickListener {
            val intent = Intent(applicationContext, TaxcardActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(applicationContext, SocialSecurityActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(applicationContext, FinnishIDActivity::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(applicationContext, DrivingLicenceActivity::class.java)
            startActivity(intent)
        }
    }
}
