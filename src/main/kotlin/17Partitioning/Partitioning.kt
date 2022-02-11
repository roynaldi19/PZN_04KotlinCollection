package `17Partitioning`

fun main() {
    val list = listOf("Roy", "Naldi", "Kiddo", "Roynaldinho")
    val (listMatch, listNotMatch) = list.partition { it.length > 4 }

    println(listMatch)
    println(listNotMatch)
}