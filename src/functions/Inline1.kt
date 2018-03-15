package functions

inline fun transaction(function: () -> Unit) {
    println("abrindo transaction")
    try {
        function()
    } finally {
        println("CLOSING transaction")
    }
}

fun main(args: Array<String>) {
    transaction { //inline notation! this code will run for each transaction o/
        println("1")
        println("2")
        println("3")
    }
}