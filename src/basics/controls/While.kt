package basics.controls

fun main(args: Array<String>) {
    var option: Int = 0

    while (option != -1) {
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0

        println("Option: $option")
    }
}