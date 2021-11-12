package com.example.dice

class Dice(val sides: Int) {
    fun roll() : Int{
        return (1..sides).random()
    }

    fun roll2() : Int {
        return (1..sides).random()
    }
}