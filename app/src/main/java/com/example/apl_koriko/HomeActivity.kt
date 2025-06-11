package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val catAngka: ImageView = findViewById(R.id.catAngka)
        val catHuruf: ImageView = findViewById(R.id.catHuruf)
        val catTransportasi: ImageView = findViewById(R.id.catTransportasi)
        val catBuah: ImageView = findViewById(R.id.catBuah)
        val catHewan: ImageView = findViewById(R.id.catHewan)
        val catPercakapan: ImageView = findViewById(R.id.catPercakapan)

        catAngka.setOnClickListener {
            startActivity(Intent(this, AngkaActivity::class.java))
        }

        catHuruf.setOnClickListener {
            startActivity(Intent(this, HurufActivity::class.java))
        }

        catTransportasi.setOnClickListener {
            startActivity(Intent(this, TransportasiActivity::class.java))
        }

        catBuah.setOnClickListener {
            startActivity(Intent(this, BuahActivity::class.java))
        }

        catHewan.setOnClickListener {
            startActivity(Intent(this, HewanActivity::class.java))
        }

        catPercakapan.setOnClickListener {
            startActivity(Intent(this, PercakapanActivity::class.java))
        }
    }
}
