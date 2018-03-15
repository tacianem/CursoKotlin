package collections

fun main(args: Array<String>) {
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião") //mutable!

    for(item in strings) {
        println(item.toUpperCase()) //it infers the type of the list by its own.
    }
}