package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_driving_licence.*
import kotlinx.android.synthetic.main.activity_finnish_i_d.*

class DrivingLicenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driving_licence)

        button_driving.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.ajovarma.fi/en/"))
            startActivity(intent)
        }

        button_medical.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://ajanvaraus.perusterveys.fi/"))
            startActivity(intent)
        }
    }
}
