package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Getting All Views
        diceImage1 = findViewById(R.id.dice1)
        diceImage2 = findViewById(R.id.dice2)
        val rollButton = findViewById<Button>(R.id.roll)

        rollButton.setOnClickListener {
            rollDice()
        }

    }

    //Creating the fumction to roll a Dice and display
    private fun rollDice() {
        //Creating instance of dice1
        var dice = Dice(6)
        var rollDice = dice.roll()

        //Getting the Drawable Dice1

        var drawableDice = when (rollDice) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        //Setting the Image Resources
        diceImage1.setImageResource(drawableDice)

        //Creating Instance of Dice2

        var dice2 = Dice(6)
        var rollDice2 = dice2.roll2()

        //Getting the Drawable for Dice2

        var drawableDice2 = when(rollDice2) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImage2.setImageResource(drawableDice2)


    }








}