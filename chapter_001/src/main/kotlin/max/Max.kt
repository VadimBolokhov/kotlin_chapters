package max

/**
 * Возвращает наибольшее из двух целых чисел.
 * @param first - первое сравниваемое число.
 * @param second - второе сравниваемое число.
 * @return наибольшее из двух.
 */
fun max(first: Int, second: Int) = if (first >= second) first else second

/**
 * Возвращает наибольшее из трех целых чисел.
 * @param first - первое сравниваемое число.
 * @param second - второе сравниваемое число.
 * @param third - третье сравниваемое число.
 * @return наибольшее из трех.
 */
fun max(first: Int, second: Int, third: Int) = max(first, max(second, third))