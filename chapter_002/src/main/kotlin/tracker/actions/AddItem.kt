package tracker.actions

import tracker.Input
import tracker.Item
import tracker.Tracker

class AddItem(
    override val key: Int,
    override val info: String): UserAction {

    override val execute: (input: Input, tracker: Tracker) -> Unit
        get() = { input, tracker ->
            println("------------ Добавление новой заявки ------------")
            val name = input.ask("Введите имя заявки : ")
            val desc = input.ask("Введите описание заявки : ")
            val item = Item(name, desc)
            tracker.add(item)
            println("------------ Новая заявка с Id : ${item.id} ------------")
        }
}