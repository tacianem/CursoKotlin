package basics.operators

fun main(args: Array<String>) {
    val (v1, v2, v3, v4) = listOf(2, 3, 5, 23) //atribui valores da lista a variaveis DIRECTLY!!!!!! LOVED IT <3

    val soma = v1 + v3
    val subtracao = v4 - v2
    val divisao = v1/v1
    val mult = v3 * v4
    val modulo = soma % 2

    print("$soma $subtracao $divisao $mult $modulo")

}