package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clothes.*
import kotlinx.android.synthetic.main.activity_prisma.*

class ClothesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothes)

        button13.setOnClickListener {
            val intent = Intent(applicationContext, SearchActivity::class.java)
            startActivity(intent)
        }
        button13.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://kontti.redcross.fi/"))
            startActivity(intent)
        }

        button14.setOnClickListener {
            val intent = Intent(applicationContext, SearchActivity::class.java)
            startActivity(intent)
        }
        button14.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://toppila-center.business.site/"))
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(applicationContext, SearchActivity::class.java)
            startActivity(intent)
        }
        button15.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://esnoulu.org/"))
            startActivity(intent)
        }
    }
}
