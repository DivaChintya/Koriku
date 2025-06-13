package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HewanActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hewan2)

        val nextButton = findViewById<ImageView>(R.id.next)
        nextButton.setOnClickListener {
            val intent = Intent(this, HewanActivity2::class.java)
            startActivity(intent)
        }

        val prevButton = findViewById<ImageView>(R.id.prev)
        prevButton.setOnClickListener {
            val intent = Intent(this, HewanActivity::class.java)
            startActivity(intent)
        }

        val homeButton = findViewById<ImageView>(R.id.nextHomeH)
        homeButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
