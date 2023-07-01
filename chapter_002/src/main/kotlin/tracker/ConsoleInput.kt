package tracker

class ConsoleInput : Input {

    override fun ask(question: String): String {
        println(question)
        return readLine() ?: ""
    }

    override fun ask(question: String, range: List<Int>): Int {
        println(question)
        val key: Int = readLine()!!.toInt()
        if (!range.contains(key)) {
            throw MenuOutException("Пункта меню не существует")
        }

        return key
    }
}