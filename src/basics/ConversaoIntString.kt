package basics

fun main(args: Array<String>) {
    val a = 1

// Número para String
    println(a.toString() + 1)


// String para Número
    println("1.9".toDoubleOrNull() ?: 2.0 + 3)
    println("bleh".toDoubleOrNull() ?: 2.0 + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
    println("1".toInt() + 3)
}
