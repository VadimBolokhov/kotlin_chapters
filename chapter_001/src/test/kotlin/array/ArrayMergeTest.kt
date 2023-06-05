package array

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

/**
 * ArrayMerge Test.
 *
 * @author Vadim Bolokhov
 * @version $Id$
 * @since 0.1
 */
class ArrayMergeTest {
    /**
     * Test merge()
     */
    @Test
    fun whenMergeTwoSortedArraysThenReturnOneBigSortedArray() {
        val first = intArrayOf(1, 3, 5, 6, 8, 9, 10)
        val second = intArrayOf(2, 4, 7)
        val result: IntArray = merge(first, second)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        assertContentEquals(expected, result)
    }
}