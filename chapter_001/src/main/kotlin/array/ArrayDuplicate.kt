package array

fun remove(array: Array<String>): Array<String> {
    var duplicates: Int = 0
    var last = array.size - 1
    for (i in 0 until last) {
        for (j in last downTo i + 1) {
            if (array[i] == array[j]) {
                for (k in j until last) {
                    var cache = array[k]
                    array[k] = array[k + 1]
                    array[k + 1] = cache
                }
                duplicates++
                last = array.size - duplicates - 1
            }
        }
    }
    return array.copyOfRange(0, last + 1)
}