package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bikes.*
import kotlinx.android.synthetic.main.activity_bus.*
import kotlinx.android.synthetic.main.activity_finnish_i_d.*

class FinnishIDActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finnish_i_d)


        button_police.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.poliisi.fi/oulu/contactinformation#oulu"))
            startActivity(intent)
        }

        button_moreinfo.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.poliisi.fi/applying_for_an_identity_card"))
            startActivity(intent)
        }
    }
}
