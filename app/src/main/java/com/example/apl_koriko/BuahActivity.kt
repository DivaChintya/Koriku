package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BuahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buah1)

        val nextButton = findViewById<ImageView>(R.id.nextApel)
        nextButton.setOnClickListener {
            val intent = Intent(this, BuahActivity1::class.java)
            startActivity(intent)
        }
    }
}
