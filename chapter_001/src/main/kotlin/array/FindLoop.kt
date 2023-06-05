package array

/**
 * Проверяет наличие элемента в заданном массиве.
 *
 * @param data Массив целых чисел.
 * @param el Искомый элемент.
 * @return Номер элемента. Возвращает -1 если элемент не найден.
 */
fun indexOf(data: IntArray, el: Int): Int {
    var result: Int = -1
    for (index in data.indices) {
        if (data[index] == el) {
            result = index
            break
        }
    }
    return result
}