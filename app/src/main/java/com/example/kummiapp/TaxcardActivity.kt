package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bikes.*
import kotlinx.android.synthetic.main.activity_taxcard.*

class TaxcardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taxcard)

        button6.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.vero.fi/en/About-us/contact-us/local-tax-offices/northern-finland-tax-office/"))
            startActivity(intent)
        }

        button7.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.vero.fi/en/individuals/tax-cards-and-tax-returns/tax_card/"))
            startActivity(intent)
        }

    }
}
