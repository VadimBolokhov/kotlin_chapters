package tracker

import java.lang.NumberFormatException

class ValidateInput(private val input: Input) : Input by input {

    override fun ask(question: String, range: List<Int>): Int {
        var valid = false
        var key = -1
        while (!valid) {
            try {
                key = input.ask(question, range)
                valid = true
            } catch (moe: MenuOutException ) {
                println(moe.message)
            } catch (nfe: NumberFormatException) {
                println("Введите корректное значение")
            }
        }

        return key
    }
}