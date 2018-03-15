package functions

inline fun <T> executarComLog (functionName: String, function: () -> T): T {
    println("Entrando -ui em $functionName")
    try{
        return function()
    }
    finally {
        println("FIM.")
    }
}

fun sum(a: Int, b: Int): Int = a+b

fun main(args: Array<String>) {
    val result = executarComLog("sum") {
        sum(5,9)
        //1+3
        "Teste"
    }

    println(result)
}