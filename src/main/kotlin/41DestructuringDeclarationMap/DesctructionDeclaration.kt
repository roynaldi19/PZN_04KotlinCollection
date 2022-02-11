package `41DestructuringDeclarationMap`

fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    for ((key, value) in map) {
        println("$key : $value")
    }
    map.forEach { (key, value) -> println("$key : $value") }
}