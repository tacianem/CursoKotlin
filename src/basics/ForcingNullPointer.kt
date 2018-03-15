package basics

fun main(args: Array<String>) {
    //Forçando NULLPOINTER EXCEPTION with !!

    var a :Int? = null
    a!!.inc()
    //em vez de a?.inc() >>>> a!!.inc() //inc and dec to increment or decrement an integer value

}