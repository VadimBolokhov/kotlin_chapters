package array

import org.junit.jupiter.api.Assertions.assertFalse
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * ArrayChar Test.
 *
 * @author Vadim Bolokhov
 * @version $Id$
 * @since 0.1
 */
class ArrayCharTest {
    /**
     * Тест метода startWith() для случая, когда слово начинается с префикса
     */
    @Test
    fun whenStartWithPrefixThenTrue() {
        val word = ArrayChar("Hello")
        val result = word.startWith("He")
        assertTrue(result)
    }

    /**
     * Тест метода startWith() для случая, когда слово НЕ начинается с префикса
     */
    @Test
    fun whenNotStartWithPrefixThenFalse() {
        val word = ArrayChar("Hello")
        val result = word.startWith("Hi")
        assertFalse(result)
    }
}