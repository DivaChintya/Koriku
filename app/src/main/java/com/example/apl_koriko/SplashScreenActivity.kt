package com.example.apl_koriko

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

     Handler().postDelayed({
         startActivity(Intent(this@SplashScreenActivity, RegisterActivity::class.java))
        finish()
     },3000)
    }
}