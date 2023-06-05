package loop

/**
 * Рисует пирамиду из символов ^ и пробелов.
 *
 * @param height Высота пирамиды.
 * @return Пирамида.
 */
fun pyramid(height: Int) = loopBy(
    height,
    2 * height - 1
) { row: Int, column: Int -> row >= height - column - 1 && row + height - 1 >= column }

/**
 * Рисует правостороннюю пирамиду из символов ^ и пробелов.
 *
 * @param height Высота пирамиды.
 * @return Пирамида.
 */
fun rightTrl(height: Int): String {
    return loopBy(height, height) { row, column -> row >= column }
}

/**
 * Рисует левостороннюю пирамиду из символов ^ и пробелов.
 *
 * @param height Высота пирамиды.
 * @return Пирамида.
 */
fun leftTrl(height: Int) = loopBy(height, height) { row, column -> row >= height - column - 1 }

/**
 * Рисует пирамиду различной формы, определяемой параметрами.
 *
 * @param height Высота пирамиды.
 * @param width Ширина пирамиды.
 * @param predict Определяет форму пирамиды.
 * @return Пирамида.
 */
fun loopBy(height: Int, width: Int, predict: (Int, Int) -> Boolean): String {
    val screen = StringBuilder()
    for (row in 0 until height) {
        for (column in 0 until width) {
            if (predict(row, column)) {
                screen.append("^")
            } else {
                screen.append(" ")
            }
        }
        screen.append(System.lineSeparator())
    }

    return screen.toString()
}