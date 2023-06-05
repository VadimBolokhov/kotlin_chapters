package loop

/**
 * Вычисляет факториал заданного числа.
 * @param n Число, факториал которого необходимо вычислить.
 * @return Результат вычисления факториала.
 */
fun calculateFactorial(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }

    return result
}