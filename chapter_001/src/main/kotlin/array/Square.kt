package array

/**
 * Возвращает мыссив заполненный, квадратами чисел от 1 до bound.
 *
 * @param bound Длина массива.
 * @return Массив.
 */
fun calculatePowers(bound: Int): IntArray {
    val result = IntArray(bound)
    for (i in 0 until bound) {
        result[i] = (i + 1) * (i + 1)
    }
    return result
}