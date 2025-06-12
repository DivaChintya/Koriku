package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TransportasiActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transportasi2)

        val nextButton = findViewById<ImageView>(R.id.nextMotor)

        nextButton.setOnClickListener {
            val intent = Intent(this, TransportasiActivity2::class.java)
            startActivity(intent)
        }
    }
}
