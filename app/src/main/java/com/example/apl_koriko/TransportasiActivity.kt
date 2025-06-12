package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TransportasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transportasi1)

        val nextButton = findViewById<ImageView>(R.id.nextMobil)

        nextButton.setOnClickListener {
            val intent = Intent(this, TransportasiActivity1::class.java)
            startActivity(intent)
        }
    }
}
