package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AngkaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_angka1)

        val nextButton = findViewById<ImageView>(R.id.nextSatu)

        nextButton.setOnClickListener {
            val intent = Intent(this, AngkaActivity1::class.java)
            startActivity(intent)
        }
    }
}
