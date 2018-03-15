package advanced

//fun factorial (num: Int): Int = if (num in 0..1) 1 else num * factorial(num-1)

fun factorial (num: Int): Int = when (num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * factorial(num-1)
    else -> throw IllegalArgumentException("Negative numbers not allowed here, dumbass")
}

fun main(args: Array<String>) {
    println(factorial(5))
}