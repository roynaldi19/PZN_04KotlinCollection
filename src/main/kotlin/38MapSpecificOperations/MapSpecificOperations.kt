package `38MapSpecificOperations`

fun main() {
    val map = mapOf("a" to "Roy", "b" to "Naldi", "c" to "kiddo")
    println(map.getValue("a"))
    println(map.getOrElse("x"){ "Ups"})
    println(map.filter { (key, value) -> value.length > 4 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { value -> value.length > 4 })
}