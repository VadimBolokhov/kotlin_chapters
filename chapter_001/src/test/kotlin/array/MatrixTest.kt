package array

import kotlin.test.Test
import kotlin.test.assertTrue

class MatrixTest {

    @Test
    fun whenMultipleFiveThenMultiplicationTableFiveToFive() {
        val expected = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 4, 6, 8, 10),
            intArrayOf(3, 6, 9, 12, 15),
            intArrayOf(4, 8, 12, 16, 20),
            intArrayOf(5, 10, 15, 20, 25))
        val result = multiple(5)
        assertTrue(expected contentDeepEquals result)
    }
}