package loop

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BoardTest {

    /**
     * Test paint(3, 3).
     */
    @Test
    fun whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        val line = System.getProperty("line.separator")
        val result = paint(3, 3)
        val expected = "X X$line X ${line}X X$line"
        assertEquals(expected, result)
    }
}