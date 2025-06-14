package com.example.apl_koriko

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TransportasiActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transportasi1)

        val nextButton = findViewById<ImageView>(R.id.next)
        nextButton.setOnClickListener {
            val intent = Intent(this, TransportasiActivity1::class.java)
            startActivity(intent)
        }

        val homeButton = findViewById<ImageView>(R.id.nextHomeH)
        homeButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val soundButton = findViewById<ImageView>(R.id.button_sound)
        soundButton.setOnClickListener {
            playSound(R.raw.trans_mobil)
        }
    }

    private fun playSound(resId: Int) {
        mediaPlayer?.release()
        mediaPlayer = MediaPlayer.create(this, resId)
        mediaPlayer?.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
