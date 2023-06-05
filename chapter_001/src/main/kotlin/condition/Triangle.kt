package condition

class Triangle(val a: Point, val b: Point, val c: Point) {

    val isEquilateral: Boolean
        get() = a.distanceTo(b) == b.distanceTo(c)
                    && c.distanceTo(a) == a.distanceTo(b)

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     *
     * @param ab расстояние между точками a b.
     * @param ac расстояние между точками a c.
     * @param bc расстояние между точками b c.
     * @return Периметр.
     */
    fun period(ab: Double, ac: Double, bc: Double): Double {
        return (ab + ac + bc) / 2
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
     */
    fun area(): Double {
        var rsl = -1.0
        val ab = a.distanceTo(b)
        val ac = a.distanceTo(c)
        val bc = b.distanceTo(c)
        val p = period(ab, ac, bc)
        if (exist(ab, ac, bc)) {
            rsl = kotlin.math.sqrt(p * (p - ab) * (p - ac) * (p - bc))
        }
        return rsl
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param ab Расстояние от точки a до точки b.
     * @param ac Расстояние от точки a до точки c.
     * @param bc Расстояние от точки b до точки c.
     */
    private fun exist(ab: Double, ac: Double, bc: Double): Boolean {
        return (ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab)
    }
}