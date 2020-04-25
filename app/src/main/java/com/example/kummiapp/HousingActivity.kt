package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_housing.*
import kotlinx.android.synthetic.main.activity_prisma.*

class HousingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_housing)

        button10.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.psoas.fi/en/"))
            startActivity(intent)
        }


        button26.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.infofinland.fi/en/oulu/life-in-oulu/housing-in-oulu"))
            startActivity(intent)
        }
    }
}
