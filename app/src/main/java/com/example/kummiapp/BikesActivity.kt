package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_appliances.*
import kotlinx.android.synthetic.main.activity_bikes.*

class BikesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bikes)



        button19.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.facebook.com/groups/bikeoulu/"))
            startActivity(intent)
        }



        button20.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.jussinpyora.fi/"))
            startActivity(intent)
        }




    }

}
