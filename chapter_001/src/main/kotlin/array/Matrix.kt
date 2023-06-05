package array

/**
 * Квадратная таблица умножения.
 * @param size размер таблицы
 * @return таблица умножения
 */
fun multiple(size: Int): Array<IntArray> {
    val array = Array(size) { IntArray(size) }
    for (i in 0 until size) {
        for (j in 0 until size) {
            array[i][j] = (i + 1) * (j + 1)
        }
    }

    return array
}