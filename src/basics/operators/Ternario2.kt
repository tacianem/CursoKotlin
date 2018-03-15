package basics.operators

fun obterResultado(nota : Double) : String = if(nota >= 7.0) "Passou" else "Reprovou"
//bloco de uma linha/expressao NAO precisa de CURLY BRACES e aciona o return automaticamente no = !!!!!!!

fun main(args: Array<String>) {
    print(obterResultado(8.3))
}