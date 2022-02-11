package `30CustomOrder`

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(Fruit("Apple", 10), Fruit("Orange", 5))
    println(fruits.sortedBy { it.quantity })
    println(fruits.sortedByDescending { it.quantity })
    println(fruits.sortedWith(compareBy { it.quantity }))
    println(fruits.sortedWith(compareByDescending { it.quantity }))
    println(fruits.sortedWith(Comparator { a, b ->
        a.quantity.compareTo(b.quantity)
    }))
}