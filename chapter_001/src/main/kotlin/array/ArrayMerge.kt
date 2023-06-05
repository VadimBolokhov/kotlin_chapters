package array

/**
 * Объединяет два отсортированных массива в один отсортированный
 * @param first первый массив
 * @param second второй массив
 * @return отсортированный массив
 */
fun merge(first: IntArray, second: IntArray): IntArray {
    val result = IntArray(first.size + second.size)
    var i = 0; var j = 0; var k = 0
    while (i < first.size && j < second.size) {
        if (first[i] < second[j]) {
            result[k++] = first[i++]
        } else {
            result[k++] = second[j++]
        }
    }
    if (first.size > second.size) {
        System.arraycopy(first, i, result, k, result.size - k)
    } else {
        System.arraycopy(second, j, result, k, result.size - k)
    }
    return result
}