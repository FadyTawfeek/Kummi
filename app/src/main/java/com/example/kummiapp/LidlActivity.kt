package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prisma.*

class LidlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lidl)

        button3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.google.com/maps/search/lidl/"))
            startActivity(intent)
        }


        button11.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.lidl.fi/"))
            startActivity(intent)
        }
    }
}