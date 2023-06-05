package array

/**
 * Сортирует заданный массив.
 * @param array массив для сортировки
 * @return упорядоченный массив
 */
fun sort(array: IntArray): IntArray {
    for (run in 1 until array.size) {
        for (i in 0 until array.size - run) {
            if (array[i] > array [i + 1]) {
                val cache = array[i]
                array[i] = array[i + 1]
                array[i + 1] = cache
            }
        }
    }
    return array
}