package basics

fun sum(a: Int, b: Int = 1): Int {
    return a + b
}

fun main(args: Array<String>) {
    println(sum(2,3))
    println(sum(13))
}
