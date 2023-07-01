package tracker

import tracker.actions.AddItem
import tracker.actions.UserAction

class MenuTracker(
    private val input: Input,
    private val tracker: Tracker
) {
    
    companion object {
        const val ASK_ITEM_ID = "Введите id заявки : "
        const val WRONG_ID = "Заявки с заданным id не существует"
    }

    var exit: Boolean = false
        private set(value) {
            field = value
        }

    val actions: MutableList<UserAction> = ArrayList()

    fun fillActions() {
        var key = 0
        actions.add(AddItem(key++, "Add new Item"))
        actions.add(ShowAllItems(key++, "Show all items"))
        actions.add(EditItem(key++, "Edit item"))
        actions.add(DeleteItem(key++, "Delete item"))
        actions.add(FindById(key++, "Find item by id"))
        actions.add(FindByName(key++, "Find item by name"))
        actions.add(Exit(key++, "Exit"))
    }

    fun showMenu() {
        println("Меню")
        actions.forEach() { println("${it.key}. ${it.info}") }
    }

    /**
     * Вывод на консоль списка заявок
     * @param items массив заявок для вывода
     */
    private fun showAllItems(items: Array<Item>) {
        when {
            items.isEmpty() -> println("Заявок нет")
            else -> {
                println("*")
                items.forEach {
                    showItem(it)
                    println("*")
                }
            }
        }
    }

    /**
     * Выводит имя, описание и id заявки
     * @param item заявка
     */
    private fun showItem(item: Item) {
        println(item)
    }

    /**
     * Выполнение выбранного пункта меню
     */
    fun select(key: Int) {
        actions[key].execute(input, tracker)
    }

    private inner class ShowAllItems(override val key: Int,
                               override val info: String) : UserAction {

        override val execute: (input: Input, tracker: Tracker) -> Unit
            get() = {
                _, tracker -> this@MenuTracker.showAllItems(tracker.getAll())
            }
    }

    private class EditItem(
        override val key: Int,
        override val info: String
    ) : UserAction {

        override val execute: (input: Input, tracker: Tracker) -> Unit
            get() = { put, ker ->
                println("------------ Редактирование заявки ------------")
                val id = put.ask(ASK_ITEM_ID)
                if (ker.findById(id) == null) {
                    println(WRONG_ID)
                } else {
                    val name = put.ask("Введите новое имя заявки : ")
                    val desc = put.ask("Введите описание заявки : ")
                    val item = Item(name, desc)
                    ker.replace(id, item)
                    println("------------ Заявка отредактирована ------------")
                }
            }
    }

    private class FindById(
        override val key: Int,
        override val info: String
    ) : UserAction {

        override val execute: (input: Input, tracker: Tracker) -> Unit
            get() = {
                input, tracker ->
                println("------------ Найти заявку по id ------------")
                val id = input.ask(ASK_ITEM_ID)

                println(tracker.findById(id) ?: "Заявки не существует")
            }
    }

    private inner class Exit(
        override val key: Int,
        override val info: String
    ) : UserAction {

        override val execute: (input: Input, tracker: Tracker) -> Unit
            get() = {
                _, _ -> this@MenuTracker.exit = true
            }
    }

    private class DeleteItem(
        override val key: Int,
        override val info: String
    ) : UserAction {

        override val execute: (input: Input, tracker: Tracker) -> Unit
            get() = {
                input, tracker ->
                println("------------ Удаление заявки ------------")
                val id = input.ask(ASK_ITEM_ID)
                val item = tracker.findById(id)

                if (item !=null) {
                    tracker.delete(id)
                    println("------------ Заявка удалена ------------")
                } else {
                    println(WRONG_ID)
                }
            }
    }

    private inner class FindByName(
        override val key: Int,
        override val info: String
    ) : UserAction {

        override val execute: (input: Input, tracker: Tracker) -> Unit
            get() = {
                input, tracker ->
                println("------------ Найти заявки по имени ------------")
                val name = input.ask("Введите имя заявки : ")
                this@MenuTracker.showAllItems(tracker.findByName(name))
            }
    }
}