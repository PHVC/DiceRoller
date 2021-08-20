package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/* Esta atividade permite o usuario lancar um dado e ver o resultado na tela */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button_click)
        rollButton.setOnClickListener { rollDice() }
    }
    /* Rola um dado e atualiza o resultado em uma tela */
    private fun rollDice() {
        // Criando um dado de 6 lados
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Atualizando o resultado na tela
        val diceImage: ImageView = findViewById(R.id.dice_image)

        // Mudando as imagens conforme o resultado do dado
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}