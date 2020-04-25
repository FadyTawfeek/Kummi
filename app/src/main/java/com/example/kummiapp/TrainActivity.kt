package com.example.kummiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_local_bus.*
import kotlinx.android.synthetic.main.activity_train.*

class TrainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_train)

        button_vr.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.vr.fi/cs/vr/en/frontpage"))
            startActivity(intent)
        }
    }
}
