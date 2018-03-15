package basics.operators

import java.util.*

fun main(args: Array<String>) {

    val name = "Renan"
    val name2 = "Renan"

    println("Igualdade REFERENCIAL (lugar na memória e valor) String nome: ${name === name2}")
    println("momoi" === "momoi")


    val d1 = Date(0)
    val d2 = Date(0)

    println("Igualdade REFERENCIAL (lugar na memória e valor) Dates c/ new: ${d1 === d2}")
    println("Igualdade ESTRUTURAL <<<< (lugar na memória e valor) Dates c/ new: ${d1 == d2}") //iguais estruturalmente
    //chama o EQUALS do objeto!






}