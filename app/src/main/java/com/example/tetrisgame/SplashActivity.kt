package com.example.tetrisgame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_play_button.playButton

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Assuming your splash screen layout file is named activity_splash
        setContentView(R.layout.activity_splash)

        // Using a Handler associated with the MainLooper to delay the transition to MainActivity for 2 seconds (2000 milliseconds)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, playButton::class.java)
            startActivity(intent)
            finish() // Close the splash activity so that it's not in the back stack
        }, 2000)
    }
}
