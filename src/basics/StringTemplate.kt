package basics

fun main(args: Array<String>) {

    val list = listOf("um","dois")
    println("Olha como é massa concatenar assim ${list[0]}")

    val goodHumour = true
    println("Today I am ${if (goodHumour) "feliz" else "chateado"}.")

    val a: Int = 33.dec()
    val b = a.toString()
    println("Int: $b which starts with ${b.first()}")
}