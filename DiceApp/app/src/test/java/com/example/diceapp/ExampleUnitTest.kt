package com.example.diceapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTest {
    private val dice: Dice = Dice(6);

    @Test
    fun CheckSidesIsPositiveNumber() {
        val result: Int = dice.getSides();
        assertTrue(result > 0);
    }

    @Test
    fun TestGeneratedRandomNumberIsBiggerThanZero() {
        val result: Int = dice.roll();
        assertTrue(result > 0);
    }
}