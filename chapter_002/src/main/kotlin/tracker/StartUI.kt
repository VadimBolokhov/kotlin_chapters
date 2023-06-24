package tracker

fun main(args: Array<String>) {
    StartUI(ConsoleInput(), Tracker()).init()
}

class StartUI(
    /** Получение данных от полльзователя */
    private val input: Input,
    /** Хранилище заявок */
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
        var exit: Boolean = false
        while (!exit) {
            showMenu()
            val answer = input.ask("Введите пункт меню : ")
            when (answer) {
                ADD -> createItem()
                SHOW -> showAllItems(tracker.getAll())
                EDIT -> editItem()
                DELETE -> deleteItem()
                FIND_BY_ID -> findItemById()
                FIND_BY_NAME -> findItemByName()
                EXIT -> exit = true
            }
        }
    }

    /**
     * Создание новой заявки
     */
    private fun createItem() {
        println("------------ Добавление новой заявки ------------")
        val name = input.ask("Введите имя заявки : ")
        val desc = input.ask("Введите описание заявки : ")
        val item = Item(name, desc)
        tracker.add(item)
        println("------------ Новая заявка с Id : ${item.id} ------------")
    }

    /**
     * Выводит имя, описание и id заявки
     * @param item заявка
     */
    private fun showItem(item: Item) {
        println(item)
    }

    /**
     * Вывод на консоль списка заявок
     * @param items массив заявок для вывода
     */
    private fun showAllItems(items: Array<Item>) {
        when {
            items.isEmpty() -> println("Заявок нет")
            else -> {
                items.forEach {
                    showItem(it)
                    println("*")
                }
            }
        }
    }

    /**
     * Редактирование заявки
     */
    private fun editItem() {
        println("------------ Редактирование заявки ------------")
        val id = input.ask("Введите id заявки : ")
        if (tracker.findById(id) == null) {
            println("Заявки с заданным id не существует")
        } else {
            val newName = input.ask("Введите новое имя заявки : ")
            val newDesc = input.ask("Введите описание заявки : ")
            tracker.replace(id, Item(newName, newDesc))
            println("------------ Заявка отредактирована ------------")
        }
    }

    /**
     * Удаление заявки
     */
    private fun deleteItem() {
        println("------------ Удаление заявки ------------")
        val id = input.ask("Введите id заявки : ")
        if (tracker.findById(id) == null) {
            println("Заявки с заданным id не существует")
        } else {
            tracker.delete(id)
            println("------------ Заявка удалена ------------")
        }
    }

    /**
     * Поиск заявки по id
     */
    private fun findItemById() {
        println("------------ Найти заявку по id ------------")
        val id = input.ask("Введите id заявки : ")
        if (tracker.findById(id) == null) {
            println("Заявки с заданным id не существует")
        } else {
            println(this.tracker.findById(id))
        }
    }

    /**
     * Поиск заявки по имени
     */
    private fun findItemByName() {
        println("------------ Найти заявки по имени ------------")
        val name = input.ask("Введите имя заявки : ")
        showAllItems(tracker.findByName(name))
    }

    /**
     * Вывод меню пльзователя на экран
     */
    private fun showMenu() {
        val menu = """
            Меню
            0. Add new Item
            1. Show all items
            2. Edit item
            3. Delete item
            4. Find item by Id
            5. Find items by name
            6. Exit Program
        """.trimIndent()
        println(menu)
    }
}