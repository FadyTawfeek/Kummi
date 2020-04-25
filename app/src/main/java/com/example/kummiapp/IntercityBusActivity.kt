package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intercity_bus.*
import kotlinx.android.synthetic.main.activity_local_bus.*

class IntercityBusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intercity_bus)

        button_onni.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.onnibus.com/home"))
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.matkahuolto.fi/en"))
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "http://www.expressbus.fi/en/home/"))
            startActivity(intent)
        }
    }
}
