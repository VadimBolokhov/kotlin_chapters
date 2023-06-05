package condition

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PointTest {

    @Test
    fun whenFirstZeroZeroSecondThreeFourThenFive() {
        val a = Point(0, 0)
        val b = Point(3, 4)
        val result = a.distanceTo(b)
        val expected = 5.0
        assertEquals(expected, result)
    }
}