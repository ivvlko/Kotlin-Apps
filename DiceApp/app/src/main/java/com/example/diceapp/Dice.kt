package com.example.diceapp

class Dice (private val sides: Int) {

    fun roll(): Int{
        return (1..sides).random();
    }
}