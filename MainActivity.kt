package com.mitali.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
        lateinit var btnRoll : Button
    lateinit var imgDice : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRoll = findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener {
           // Toast.makeText(this@MainActivity,"Dice is rolled",Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }
    private fun rollDice() {
        val random =Random.nextInt(6) + 1
        imgDice = findViewById(R.id.imgDice)
        val randomImg = when(random){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
      imgDice.setImageResource(randomImg)
    }
}
