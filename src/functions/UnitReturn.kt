package functions

fun printBiggest1(a:Int, b: Int){
    println(Math.max(a,b))
}

fun printBiggest2(a:Int, b: Int): Unit{ //explicita retorno void = Unit
    println(Math.max(a,b))
}

fun printBiggest3(a:Int, b: Int): Unit {
    println(Math.max(a,b))
    return
}

fun printBiggest4(a:Int, b: Int): Unit {
    println(Math.max(a,b))
    return Unit //explicita o retorno do Unit
}

fun printBiggest5(a:Int, b: Int) {
    println(Math.max(a,b))
    return Unit //explicita o retorno do Unit
}

fun printBiggest6(a:Int, b: Int) {
    println(Math.max(a,b))
    return
}

fun main(args: Array<String>) {
    printBiggest1(2,3)
    printBiggest2(2,3)
    printBiggest3(2,3)
    printBiggest4(2,3)
    printBiggest5(2,3).run { 3 > 2 }.run { println("Result: $this") } //Unit tem metodos of its own!
    printBiggest6(2,3)
}