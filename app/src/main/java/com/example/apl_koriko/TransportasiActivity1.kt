package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TransportasiActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transportasi2)

        val nextButton = findViewById<ImageView>(R.id.next)
        nextButton.setOnClickListener {
            val intent = Intent(this, TransportasiActivity2::class.java)
            startActivity(intent)
        }

        val prevButton = findViewById<ImageView>(R.id.prev)
        prevButton.setOnClickListener {
            val intent = Intent(this, TransportasiActivity::class.java)
            startActivity(intent)
        }

        val homeButton = findViewById<ImageView>(R.id.nextHomeH)
        homeButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
