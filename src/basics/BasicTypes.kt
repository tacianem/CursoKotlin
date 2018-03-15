package basics

fun main(args: Array<String>) {

    val num1: Byte = 127 //-128 a 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807 //Long.MAX_VALUE

    val num5: Float = 3.14F
    val num6: Double = 3.14

    val char: Char = 't'
    //val string: String = "charet" ?????? D:

    val boolean = true //false


    println(listOf(num1,num2,num3,num4,num5,num6, char, boolean, "Here we have our Kotlin basic types!"))


    println(2 is Int)
    println(2147483648 is Long)

    //TUDO É OBJETO!!!!!!! There's no primitive types in Kotlin! ***
    println(10.dec())
    println(2.3 is Double)

    //val gives you a read-only variable, which is the same as using the final keyword in Java

    /*
    Example: var x = 10    // int x = 10;
    >>>>>>>>>>>> val y = 25    // final int y = 25; <<<<<<<<<<<<<<<
     */

}