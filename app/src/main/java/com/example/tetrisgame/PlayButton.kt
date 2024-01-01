// com.example.tetrisgame.PlayActivity

package com.example.tetrisgame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_play_button.*

class PlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_button)

        // Set click listener for the Play button
        playButton.setOnClickListener {
            // Start the MainActivity when the play button is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: Finish the PlayActivity to remove it from the back stack
        }
    }
}
