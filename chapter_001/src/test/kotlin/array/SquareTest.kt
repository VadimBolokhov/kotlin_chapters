package array

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SquareTest {

    @Test
    fun whenCalculateBoundFiveThenOneFourNineSixteenTwentyFive() {
        val result: IntArray = calculatePowers(5)
        val expected: IntArray = intArrayOf(1, 4, 9, 16, 25)
        assertContentEquals(expected, result)
    }
}