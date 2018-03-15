package basics

fun main(args: Array<String>) {
    val optional: String? = null
    val mandatory: String = optional ?: "Default" //YAAAAAAAAAAAY
}