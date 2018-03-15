package functions

class Product(val name: String, val price: Double)

infix fun Product.moreExpensiveThan(product: Product): Boolean = this.price > product.price

fun main(args: Array<String>) {
    val p1 = Product("Ilha", 2500.00)
    val p2 = Product(price = 23.00, name = "Magia")

    println(p1 moreExpensiveThan p2)
}