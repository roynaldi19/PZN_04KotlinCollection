package `25RetrieveByPosition`

fun main() {
    val list = listOf("Roy", "Naldi", "Kiddo", "Roynaldinho")
    println(list.first())
    println(list.last())
    println(list.elementAt(1))
    println(list.elementAtOrElse(10) {""})
    println(list.elementAtOrNull(5))

}