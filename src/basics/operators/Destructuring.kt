package basics.operators

data class Carro (val marca: String, val modelo:String)

fun main(args: Array<String>) {
    val(marca, modelo) = Carro ("Chevrolet", "Cruze") //tira os dados da classe
    println("$marca $modelo")

    val (eu, amor) = listOf("Taciane", "Renan")
    println("$eu e $amor") //from list

    val (_, _, third) = listOf("first", "second", "third") //_ ignores first and second places!
    println(third)

}