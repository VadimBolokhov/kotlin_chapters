package loop

import java.util.StringJoiner
import kotlin.test.Test
import kotlin.test.assertEquals

class PaintTest {

    @Test
    fun whenPyramid4Full() {
        val result = pyramid(4)
        val expected = StringJoiner(System.lineSeparator(), "", System.lineSeparator())
            .add("   ^   ")
            .add("  ^^^  ")
            .add(" ^^^^^ ")
            .add("^^^^^^^")
            .toString()
        assertEquals(expected, result)
    }
}