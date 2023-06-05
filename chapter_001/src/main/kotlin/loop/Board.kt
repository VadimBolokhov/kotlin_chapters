package loop

/**
 * Рисует шахматную доску из символов X и пробелов.
 *
 * @param width Ширина доски.
 * @param height Высота доски.
 * @return Шахматная доска.
 */
fun paint(width: Int, height: Int): String {
    val screen = StringBuilder();
    val ln = System.lineSeparator()
    for (i in 0 until height) {
        for (j in 0 until width) {
            when {
                (i + j) % 2 == 0 -> screen.append("X")
                else -> screen.append(" ")
            }
        }
        screen.append(ln)
    }

    return screen.toString()
}