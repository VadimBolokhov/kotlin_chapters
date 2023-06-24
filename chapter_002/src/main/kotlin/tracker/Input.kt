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
}