package array

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class InvertTest {

    @Test
    fun whenBackOneTwoThreeFourFiveThenReturnReversed() {
        val array = intArrayOf(1, 2, 3, 4, 5)
        val result = reverse(array)
        val expected = intArrayOf(5, 4, 3, 2, 1)
        assertContentEquals(expected, result)
    }

    @Test
    fun whenBackFourOneSixTwoThenReturnReversed() {
        val array = intArrayOf(4, 1, 6, 2)
        val result = reverse(array)
        val expected = intArrayOf(2, 6, 1, 4)
        assertContentEquals(expected, result)
    }
}