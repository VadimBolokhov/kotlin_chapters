package condition

import kotlin.math.pow

class Point(val x: Int, val y: Int) {

    fun distanceTo(that: Point): Double {
        return kotlin.math.sqrt((that.x.toDouble() - x).pow(2) + (that.y.toDouble() - y).pow(2))
    }
}