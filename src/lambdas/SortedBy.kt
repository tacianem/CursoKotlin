package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Hm", "T ubete")
    val ordenados = nomes.sortedBy { it } // it.reversed() }

    println(ordenados)
}