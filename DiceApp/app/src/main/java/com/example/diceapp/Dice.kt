package com.example.diceapp

class Dice (private val sides: Int) {
    fun getSides(): Int{
        return this.sides;
    }
    fun roll(): Int{
        return (1..sides).random();
    }
}