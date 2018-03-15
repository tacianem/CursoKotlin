package classes

val diretoNoArquivo = "Hiiiii, dont run"

fun topLevel(){
    val local = "BOO"
    println("$diretoNoArquivo, $local")
}

class Coisa {
    var varDeInstancia: String = "Relativo a cada instancia"

    companion object { //singleton
        @JvmStatic val constanteDeClasse = "Sou unico neh" //estatico
    }

    fun fazer(){
        val local: Int = 23

        if (local > 3) {
            val variavelDeBloco = "Ninguem mais me ve!"
            println("$varDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }

}

fun main(args: Array<String>) {
    topLevel()
    Coisa().fazer() // coisa = Coisa() + coisa.fazer()
    println(Coisa.constanteDeClasse)
}