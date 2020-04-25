package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_banking.*
import kotlinx.android.synthetic.main.activity_finnish_i_d.*

class BankingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banking)

        button_op.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.op.fi/home-page"))
            startActivity(intent)
        }

        button_nordea.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.nordea.fi/en/"))
            startActivity(intent)
        }

        button_danske.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://danskebank.fi/en/for-you/for-you"))
            startActivity(intent)
        }

        button_bankmoreinfo.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.educba.com/banks-in-finland/"))
            startActivity(intent)
        }
    }
}
