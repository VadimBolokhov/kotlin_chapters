package tracker

class ConsoleInput : Input {

    override fun ask(question: String): String {
        println(question)
        return readLine() ?: ""
    }
}