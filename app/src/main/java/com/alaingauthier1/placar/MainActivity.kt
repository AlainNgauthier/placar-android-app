package com.alaingauthier1.placar

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.alaingauthier1.placar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private var scorePlayer1: Int = 0
    private var scorePlayer2: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFreePlayer1.setOnClickListener(this)
        binding.buttonFreePlayer2.setOnClickListener(this)

        binding.buttonTwoPlayer1.setOnClickListener(this)
        binding.buttonTwoPlayer2.setOnClickListener(this)

        binding.buttonThreePlayer1.setOnClickListener(this)
        binding.buttonThreePlayer2.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_free_player_1) {
            scorePlayer1++
        }
        if (view.id == R.id.button_free_player_2) {
            scorePlayer2++
        }

        if (view.id == R.id.button_two_player_1) {
            scorePlayer1+2
        }
        if (view.id == R.id.button_two_player_2) {
            scorePlayer2+2
        }

        if (view.id == R.id.button_three_player_1) {
            scorePlayer1+3
        }
        if (view.id == R.id.button_three_player_2) {
            scorePlayer2+3
        }

        binding.scorePlayer1.text = "${scorePlayer1}"
        binding.scorePlayer2.text = "${scorePlayer2}"
    }
}