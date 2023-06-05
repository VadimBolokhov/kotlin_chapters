package calculator

class Calculator {
    private var result: Double = 0.0

    fun add(first: Double, second: Double) {
        result = first + second
    }

    fun subtract(first: Double, second: Double) {
        result = first - second
    }

    fun div(first: Double, second: Double) {
        result = first / second
    }

    fun multiply(first: Double, second: Double) {
        result = first * second
    }

    fun getResult(): Double {
        return this.result
    }
}