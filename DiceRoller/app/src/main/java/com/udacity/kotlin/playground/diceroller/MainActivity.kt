package com.udacity.kotlin.playground.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.udacity.kotlin.playground.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rollButton.text = "Let's Roll"
        binding.rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.empty_dice
        }
        binding.diceImage.setImageResource(drawableResource)
    }
}
