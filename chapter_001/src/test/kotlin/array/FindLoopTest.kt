package array

import kotlin.test.assertEquals
import kotlin.test.Test

class FindLoopTest {

    @Test
    fun whenIndexOfFoundFourInOneTwoThreeFourFiveThenReturnThree() {
        val data = intArrayOf(1, 2, 3, 4, 5)
        val result = indexOf(data, 4)
        assertEquals(3, result)
    }
}