package functions

fun sort (vararg numbers: Int): IntArray {
    return numbers.sortedArray()
}

fun main(args: Array<String>) {
    for (n in sort(38, 3, 56, 99, 487, 12, 5, 0, -1))
        println(n)

    for (n in sort2(38, 3, 56, 99, 487, 12, 5, 0, -1, a = 23))
        println(n)
}

fun sort2 (vararg numbers: Int, a: Int): IntArray {
    println("$a LOOOOOL")
    return numbers.sortedArray()
}
