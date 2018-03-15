package basics.controls

fun main(args: Array<String>) {

    val num1: Int = 2
    val num2: Int = 3

    val biggest = if (num1 > num2){
        println("Olá Marilene")
        num1
    }
    else
        num2

    println("Fim. $biggest")


}