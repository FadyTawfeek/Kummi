package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bus.*
import kotlinx.android.synthetic.main.activity_local_bus.*

class LocalBusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_bus)

        button_public.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.ouka.fi/oulu/public-transport/home"))
            startActivity(intent)
        }

        button21.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://kauppa.waltti.fi/en/"))
            startActivity(intent)
        }

        button22.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.oulunliikenne.fi/"))
            startActivity(intent)
        }

        button23.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.google.com/maps/search/r-kioski/"))
            startActivity(intent)
        }
    }
}
