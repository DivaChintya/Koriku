package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PercakapanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_percakapan1)

        val nextButton = findViewById<ImageView>(R.id.nextHalo)

        nextButton.setOnClickListener {
            val intent = Intent(this, PercakapanActivity1::class.java)
            startActivity(intent)
        }
    }
}
