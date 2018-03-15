package functions

class Operators {

    fun soma(a: Int, b: Int): Int = a+b

}

fun soma(a: Int, b: Int): Int{
    return a+b
}

fun calc(a: Int, b:Int, function: (Int,Int) -> Int): Int{
    return function(a,b) //simple example :B
}

fun main(args: Array<String>) {
    println(calc(2, 3, Operators()::soma)) //:: to reference the function as a parameter!
    println(calc(2, 3, ::soma)) //:: to reference the function as a parameter! TOP LEVEL METHOD
}