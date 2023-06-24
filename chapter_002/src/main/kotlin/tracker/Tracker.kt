package tracker

import java.util.*
import kotlin.random.Random

/**
 * Хранение заявок.
 * @author Vadim Bolokhov
 */
class Tracker {

    companion object {
        /** Максимальное количество заявок */
        private const val MAX_ITEMS: Int = 100
    }

    val items: Array<Item?> = arrayOfNulls(MAX_ITEMS)
    var position: Int = 0

    fun add(item: Item): Item {
        item.id = generateId()
        items[position++] = item
        return item
    }

    fun addUsingContextFunction(item: Item): Item {
        return item.apply {
            id = generateId()
            items[position++] = this
        }
    }

    /**
     * Заменяет заявку с заданным идентификатором
     * @param id идентификатор
     * @param replace замена
     */
    fun replace(id: String, replace: Item) {
        for (i in 0 until position) {
            if (items[i]?.id == id) {
                replace.id = id
                items[i] = replace
                break
            }
        }
    }

    /**
     * Удаляет из списка заявку с заданным Id
     * @param id идентификатор заявки
     */
    fun delete(id: String) {
        for ((index, element) in items.withIndex()) {
            if (element?.id == id) {
                System.arraycopy(items, index + 1, items, index, position - index - 1)
                items[--position] = null
            }
        }
    }

    /**
     * Возвращает список всех заявок
     * @return все заявки
     */
    fun getAll(): Array<Item> = Arrays.copyOf(items, position)

    /**
     * Находит все заявки с заданным именем
     * @param key имя для поиска
     * @return список всех найденных заявок
     */
    fun findByName(key: String): Array<Item> {
        return items.filterNotNull()
            .filter { item -> item.name == key }
            .toTypedArray()
    }

    /**
     * Поиск заявки по идентификатору
     * @param id идентификатор
     * @return результат поиска
     */
    fun findById(id: String): Item? {
        return items.find { item -> item?.id == id }
    }

    private fun generateId(): String {
        return (System.currentTimeMillis() + Random.nextInt()).toString()
    }
}