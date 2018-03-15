package functions

fun <E> filter(list: List<E>, filter: (E) -> Boolean): List<E>{
    val finalList = ArrayList<E>()

    for (e in list){
        if(filter(e))
            finalList.add(e)
    }
    return finalList
}

fun threeLettersNames(name: String): Boolean = name.length == 3

fun main(args: Array<String>) {
    val names = listOf("Ana", "Lara", "Ave")
    println(filter(names, ::threeLettersNames))
}