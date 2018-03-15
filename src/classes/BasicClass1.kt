package classes

class Client {
    var name: String = ""
}

fun main(args: Array<String>) {
    var client = Client()
    client.name = "Lara"

    println("Client name: ${client.name}")
}