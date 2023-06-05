package loop

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FactorialTest {

    @Test
    fun whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        val result = calculateFactorial(5)
        assertEquals(120, result)
    }

    @Test
    fun whenCalculateFactorialForZeroThenOne() {
        val result = calculateFactorial(0)
        assertEquals(1, result)
    }
}