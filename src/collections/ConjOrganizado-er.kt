package collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    // aprovados.add(1)

    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nLinked...")
    for (aprovado in aprovadosNaOrdem1) {
        aprovado.print() //ORDEM EM QUE FOI CRIADO
    }

    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nSorted...")
    for (aprovado in aprovadosNaOrdem2) {
        aprovado.print() //ORDEM ALFABETICA
    }

    // Ordem maluca...
    aprovados.sortedBy { it.substring(1) }.print() //ordena a partir da segunda letra :B
}