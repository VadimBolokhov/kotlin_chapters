package array

fun contains(origin: String, subString: String): Boolean {
    val word = origin.toCharArray()
    val subWord = subString.toCharArray()
    var result = false
    for (i in 0..(word.size - subWord.size)) {
        result = true
        for (j in subWord.indices) {
            if (word[j + i] != subWord[j]) {
                result = false
                break
            }
        }
        if (result) {
            break
        }
    }

    return result
}