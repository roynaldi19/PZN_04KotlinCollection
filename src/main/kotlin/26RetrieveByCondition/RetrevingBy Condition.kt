package `26RetrieveByCondition`

fun main() {
    val range = (1..20).toList()

    println(range.first { it > 10 })
    println(range.last { it > 10 })
    println(range.firstOrNull { it > 30 })
    println(range.lastOrNull { it > 30 })
    println(range.find { it > 30 })
    println(range.findLast { it > 30 })
}