package array

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ArrayDuplicateTest {

    @Test
    fun whenRemoveDuplicatesThenReturnArrayWithoutDuplicates() {
        val array = arrayOf("One", "Two", "Two", "Three", "Two", "Four", "Five", "Six", "Six")
        val expected = arrayOf("One", "Two", "Three", "Four", "Five", "Six")
        val result = remove(array)
        assertContentEquals(expected, result)
    }

    @Test
    fun whenRemoveNoDuplicatesThenReturnArray() {
        val array = arrayOf("One", "Two", "Three", "Four", "Five")
        val expected = arrayOf("One", "Two", "Three", "Four", "Five")
        val result = remove(array)
        assertContentEquals(expected, result)
    }
}

