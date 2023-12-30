package com.example.tetrisgame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Assuming your splash screen layout file is named activity_splash
        setContentView(R.layout.activity_splash)

        // Add a delay to simulate the splash screen
        val splashDelayMillis = 2000L // 2 seconds
        Thread.sleep(splashDelayMillis)

        // Start the main activity after the delay
        startActivity(Intent(this, MainActivity::class.java))

        // Close the splash activity to prevent it from showing again when pressing back
        finish()
    }
}
