package basics.controls

fun main(args: Array<String>) {
    var option: Int = -1

    do {
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0

        println("Option: $option")
    }  while (option != -1)
}