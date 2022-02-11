package `23Chunked`

fun main() {
    val numbers = (1..100).toList()

    val list1 = numbers.chunked(10)
    println(list1.size)
    println(list1)
}