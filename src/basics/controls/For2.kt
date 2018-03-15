package basics.controls

fun main(args: Array<String>) {
    val alunox = arrayListOf("Lara", "Josefina", "Marcela")

    for ((index, aluno) in alunox.withIndex()) {
        println("$index da aluna $aluno")
    }

}