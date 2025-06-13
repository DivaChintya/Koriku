package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BuahActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buah3)

        val nextButton = findViewById<ImageView>(R.id.nextHomeH)
        nextButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val prevButton = findViewById<ImageView>(R.id.prev)
        prevButton.setOnClickListener {
            val intent = Intent(this, BuahActivity1::class.java)
            startActivity(intent)
        }
    }
}
