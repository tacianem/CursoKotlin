package classes

class Calculadora {
    private var result: Int = 0

    fun sum(vararg  values: Int): Calculadora {
        values.forEach { result += it } //current value of the iterator?!
        return this
    }

    fun multiply(value: Int): Calculadora {
        result *= value
        return this
    }

    fun clean(): Calculadora {
        result = 0
        return this
    }

    fun print(): Calculadora {
        println(result)
        return this
    }

    fun getResult(): Int = result

}

fun main(args: Array<String>) {
    val calc = Calculadora()
    calc.sum(2,3).multiply(5).print()
    calc.sum(20).print().clean()

    println(calc.getResult())
}