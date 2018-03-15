package basics

fun smart(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

//*************************************************
fun smart2(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense a sua vida!")
    }
}

//NO NEED TO BREAK CASES IN IFS WHEN USING A WHEN STATEMENT!!!!!!!!!!!!!!!!!!!!!!!!!! <3
//*************************************************

fun main(args: Array<String>) {
    smart("Ola")
    smart(9)

    smart2("IHA")
    smart2(7)
    smart2(true)
}