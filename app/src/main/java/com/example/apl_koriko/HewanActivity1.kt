package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HewanActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hewan2)

        val nextButton = findViewById<ImageView>(R.id.nextKucing)
        nextButton.setOnClickListener {
            val intent = Intent(this, HewanActivity2::class.java)
            startActivity(intent)
        }
    }
}
