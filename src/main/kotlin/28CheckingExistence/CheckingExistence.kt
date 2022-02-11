package `28CheckingExistence`

fun main() {
    val range = (1..10).toList()
    println(range.contains(5))
    println(range.containsAll(listOf(2,3,4)))
    println(range.isEmpty())
    println(range.isNotEmpty())
}