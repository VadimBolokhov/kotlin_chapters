package array

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

/**
 * Container Test.
 *
 * @author Vadim Bolokhov
 * @version $Id$
 * @since 0.1
 */
class ContainerTest {
    /**
     * Тест метода contains() для случая, когда слово найдено
     */
    @Test
    fun whenContainsSubStringFoundThenReturnTrue() {
        val origin = "Hello world"
        val sub = "world"
        val result = contains(origin, sub)
        assertTrue(result)
    }

    /**
     * Тест метода contains() для случая, когда слово не найдено
     */
    @Test
    fun whenContainsSubStringNotFoundThenReturnFalse() {
        val origin = "Hello world"
        val sub = "word"
        val result = contains(origin, sub)
        assertFalse(result)
    }
}