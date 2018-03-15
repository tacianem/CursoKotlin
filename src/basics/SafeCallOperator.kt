package basics

fun main(args: Array<String>) {
    val a: Int? = null //possibly null
    println(a?.dec()) //it may print simply "null"
}