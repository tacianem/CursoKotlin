package classes

enum class DiaSemana2 (val nome: String, val util: Boolean) {
    DOMINGO("Domingo", false),
    SEGUNDA("Segunda", true),
    TERCA("Terça", true),
    QUARTA("Quarta", true),
    QUINTA("Quinta", true),
    SEXTA("Sexta", true),
    SABADO("Sábado", false)
}

fun main(args: Array<String>) {
    for (dia in DiaSemana2.values()) {
        println("${dia.nome} é um dia ${if(dia.util) "útil" else "do fim de semana"}.")
    }
}