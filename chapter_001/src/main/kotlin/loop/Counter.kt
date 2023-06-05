package loop

/**
 * Вычисляет сумму всех четных чисел в заданном диапазоне.
 *
 * @param start Начальное значение.
 * @param finish Конечное значение.
 * @return Сумма четных чисел.
 */
fun sum(start: Int, finish: Int): Int {
    var result = 0;
    for (i in start..finish) {
        if (i % 2 == 0) {
            result += i
        }
    }

    return result
}