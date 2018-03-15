package basics.controls

fun main(args: Array<String>) {

    for (i in 1..10) {
        if (i == 5)
            continue //ignore number 5
        // TRY NOT TO USE BREAKS AND CONTINUES AS THEY MAY COMPLICATE THE UNDERSTANDING OF YOUR CODE
        println(i)
    }
}