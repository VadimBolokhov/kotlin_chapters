package loop

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CounterTest {

    /**
     * Test add(1, 10)
     */
    @Test
    fun whenSumEvenNumbersFromOneToTenThenThirty() {
        val result = sum(1, 10)
        assertEquals(30, result)
    }
}