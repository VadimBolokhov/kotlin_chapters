package array

fun reverse(array: IntArray): IntArray {
    for (first in 0 until array.size / 2) {
        val cache: Int = array[first]
        val second: Int = array.size - 1 - first
        array[first] = array[second]
        array[second] = cache
    }
    return array
}