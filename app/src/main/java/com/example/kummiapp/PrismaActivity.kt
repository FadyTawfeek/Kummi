package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_prisma.*

class PrismaActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prisma)

        button3.setOnClickListener {
            val intent = Intent(applicationContext, PrismaMapsActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.google.com/maps/search/prisma/"))
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(applicationContext, PrismaMapsActivity::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.prisma.fi/fi/prisma"))
            startActivity(intent)
        }
    }
}
