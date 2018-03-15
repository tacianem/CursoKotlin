package basics.controls

fun main(args: Array<String>) {

    outerLoop@for (i in 1..15) {
        for (j in 1..15) {
            println("Minha nossa: i = $i , j = $j")
            if (i == 3 && j == 5) break@outerLoop
        }
    }
}
