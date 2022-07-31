package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.Boton_Prueba)

        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice's Rolled!",Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dado_6lados = Dice(6)
        val numero_dado = dado_6lados.roll()
        val diceImage : ImageView = findViewById(R.id.imageView)
        when (numero_dado) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        val dado_6lados1 = Dice(6)
        val numero_dado1 = dado_6lados1.roll()
        val diceImage1 : ImageView = findViewById(R.id.imageView2)
        when (numero_dado1) {
            1 -> diceImage1.setImageResource(R.drawable.dice_1)
            2 -> diceImage1.setImageResource(R.drawable.dice_2)
            3 -> diceImage1.setImageResource(R.drawable.dice_3)
            4 -> diceImage1.setImageResource(R.drawable.dice_4)
            5 -> diceImage1.setImageResource(R.drawable.dice_5)
            6 -> diceImage1.setImageResource(R.drawable.dice_6)
        }
    }
}
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }

}