package max

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaxTest {

    @Test
    fun whenFirstLessThanSecond() {
        val result:Int = max(1, 2)
        assertEquals(2, result)
    }

    @Test
    fun whenFirstGreaterThanSecond() {
        val result = max(2, 1)
        assertEquals(2, result)
    }

    @Test
    fun whenThreeNumbers() {
        val result = max(1, 2, 3)
        assertEquals(3, result)
    }
}