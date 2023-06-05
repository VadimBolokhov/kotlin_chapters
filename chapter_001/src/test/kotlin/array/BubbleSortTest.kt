package array

import kotlin.test.Test
import kotlin.test.assertContentEquals

class BubbleSortTest {

    @Test
    fun whenSortArrayWithTenElementsThenSortedArray() {
        val array: IntArray = intArrayOf(1, 5, 4, 2, 3, 1, 7, 8, 0, 5)
        val expected: IntArray = intArrayOf(0, 1, 1, 2, 3, 4, 5, 5, 7, 8)
        val result: IntArray = sort(array)
        assertContentEquals(expected, result)
    }
}