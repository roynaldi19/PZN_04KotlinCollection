package `18Testing`

fun main() {
    val list = listOf("Roy", "Naldi", "Kiddo", "Roynaldinho")

    println(list.any{ it.length > 4 })
    println(list.none{ it.length > 4 })
    println(list.all { it.length > 4 })
    println(list.any())
    println(list.none())
}