package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PercakapanActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_percakapan2)

        val nextButton = findViewById<ImageView>(R.id.nextHalo2)

        nextButton.setOnClickListener {
            val intent = Intent(this, PercakapanActivity2::class.java)
            startActivity(intent)
        }
    }
}
