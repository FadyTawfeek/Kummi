package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bikes.*
import kotlinx.android.synthetic.main.activity_social_security.*

class SocialSecurityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_security)

        button6.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://dvv.fi/en/oulu-en"))
            startActivity(intent)
        }

        button7.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://dvv.fi/en/foreigner-registration"))
            startActivity(intent)
        }
    }
}
