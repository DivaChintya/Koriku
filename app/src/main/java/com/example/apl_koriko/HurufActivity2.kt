package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HurufActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_huruf3)

        val nextButton = findViewById<ImageView>(R.id.nextHomeH)
        nextButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val prevButton = findViewById<ImageView>(R.id.prevYA)
        prevButton.setOnClickListener {
            val intent = Intent(this, HurufActivity1::class.java)
            startActivity(intent)

        }
    }
}
