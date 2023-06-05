package array

class ArrayChar constructor(line: String) {

    val data: CharArray = line.toCharArray()

    fun startWith(prefix: String): Boolean {
        val value = prefix.toCharArray()
        val length: Int = minOf(value.size, data.size)
        for (i in 0 until length) {
            if (data[i] != value[i]) {
                return false
            }
        }
        return true
    }
}