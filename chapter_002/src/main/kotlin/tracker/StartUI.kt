package tracker

fun main(args: Array<String>) {
    StartUI(ValidateInput(ConsoleInput()), Tracker()).init()
}

class StartUI(
    private val input: Input,
    private val tracker: Tracker
) {

    companion object {
        /** Константа меню для добавления новой заявки */
        const val ADD = "0"
        /** Константа для вывода списка заявок на экран */
        const val SHOW = "1";
        /** Константа для редактирования заявки */
        const val EDIT = "2";
        /** Константа для удаления заявки */
        const val DELETE = "3";
        /** Константа для поиска по id */
        const val FIND_BY_ID = "4";
        /** Константа для поиска заявок по имени */
        const val FIND_BY_NAME = "5";
        /** Константа для выхода из цикла */
        const val EXIT = "6";
    }

    /**
     * Основной цикл программы
     */
    fun init() {
        val menu = MenuTracker(input, tracker).also { it.fillActions() }
        var key: Int = -1
        val range: List<Int> = menu.actions.map { it.key }

        while (!menu.exit) {
            menu.showMenu()
            key = input.ask("Введите пункт меню : ", range)
            menu.select(key)
        }
    }
}