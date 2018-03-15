package basics.controls

fun main(args: Array<String>) {

    val grade = 8.3
    if (grade in 9..10) //range operator (..)
        println("Aloha")
    else if (grade in 7.0..8.9) //YAY
        println("Narutoooo")
    else
        println("Die in hell")


}