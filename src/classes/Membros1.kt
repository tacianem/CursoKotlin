package classes

class Data (var dia: Int,var mes: Int, var ano: Int) {
    fun formatar(): String = "$dia/$mes/$ano"

}

fun main(args: Array<String>) {
    var birthday: Data = Data(23,11,1993)
    println(birthday.formatar())

    with(birthday) {println("$dia/$mes/$ano")} // COISA LINDAAAAAA *-*
}