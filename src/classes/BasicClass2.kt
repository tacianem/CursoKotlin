package classes

class Pessoa1 (var name: String)

class Pessoa2 (val name: String)

class Pessoa3 (initialName: String){
    val nome: String = initialName
}

fun main(args: Array<String>) {
    val p1 = Pessoa1("Lara") //nome= "Lara"
    p1.name = "Rin"
    println(p1.name)

    val p2 = Pessoa2("Vish") //CANNOT BE MODIFIED!

    val p3 = Pessoa3("Ave")
    //p3.nome = "Something" da erro porque é atributo inner da classe!

}