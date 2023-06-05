import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculateTest {

    @Test
    fun testEcho() {
        val input = "Vadim Bolokhov"
        val expect = "Echo, echo, echo : Vadim Bolokhov"
        val result = echo(input)
        assertEquals(expect, result)
    }
}