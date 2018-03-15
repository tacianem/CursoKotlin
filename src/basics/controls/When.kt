package basics.controls

fun main(args: Array<String>) {
    val note = 5

    when(note) { // basically a switch
        10, 9 -> println("Fantástico q")
        8, 7 -> println("Watch out")
        in 3..7 -> println("Baka yaro")
        else -> println("Neat.")
    }
}