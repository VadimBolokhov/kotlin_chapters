package tracker

/**
 * Интерфейс ввода.
 * @author Vadim Bolokhov
 */
interface Input {

    /**
     * Осуществляет диалог программы с пользователем
     * @param quesiton сообщение для пользователя
     * @return ответ пользователя
     */
    fun ask(question: String): String

    /**
     * Осуществляет диалог программы с пользователем, а также проверяет
     * попадает ли ответ пользователя в заданный диапазон значений
     * @param question сообщение для пользователя
     * @param range диапазон для проверки
     * @return ответ пользователя
     */
    fun ask(question: String, range: List<Int>): Int
}