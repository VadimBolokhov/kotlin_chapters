package calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    fun whenAddOnePlusOneThenTwo() {
        val calc = Calculator()
        calc.add(1.0, 1.0)
        val result = calc.getResult()
        val expected = 2.0
        assertEquals(expected, result)
    }

    @Test
    fun whenSubtractOneMinusOneThenZero() {
        val calc = Calculator()
        calc.subtract(1.0, 1.0)
        val result = calc.getResult()
        val expected = 0.0
        assertEquals(expected, result)
    }

    @Test
    fun whenDivTwoByTwoThenOne() {
        val calc = Calculator()
        calc.div(2.0, 2.0)
        val result = calc.getResult()
        val expected = 1.0
        assertEquals(expected, result)
    }

    @Test
    fun whenMultiplyOneByTwoThenTwo() {
        val calc = Calculator()
        calc.multiply(1.0, 2.0)
        val result = calc.getResult()
        val expected = 2.0
        assertEquals(expected, result)
    }
}