package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_appliances.*
import kotlinx.android.synthetic.main.activity_clothes.*

class AppliancesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appliances)



        button16.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.facebook.com/groups/OuluSalePoint/"))
            startActivity(intent)
        }


        button17.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://kontti.redcross.fi/"))
            startActivity(intent)
        }


        button18.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://toppila-center.business.site/"))
            startActivity(intent)
        }
    }
}
