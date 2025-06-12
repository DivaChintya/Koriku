package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BuahActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buah2)

        val nextButton = findViewById<ImageView>(R.id.nextSemangka)
        nextButton.setOnClickListener {
            val intent = Intent(this, BuahActivity2::class.java)
            startActivity(intent)
        }
    }
}
