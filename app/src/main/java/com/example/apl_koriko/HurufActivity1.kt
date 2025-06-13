package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HurufActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_huruf2)

        val nextButton = findViewById<ImageView>(R.id.nextEO)
        nextButton.setOnClickListener {
            val intent = Intent(this, HurufActivity2::class.java)
            startActivity(intent)
        }

        val prevButton = findViewById<ImageView>(R.id.prevA)
        prevButton.setOnClickListener {
            val intent = Intent(this, HurufActivity::class.java)
            startActivity(intent)

        }

        val homeButton = findViewById<ImageView>(R.id.nextHomeH)
        homeButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
