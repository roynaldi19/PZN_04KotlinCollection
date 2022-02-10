package `05Map`

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("A" , "Roynaldi"),
        "B" to "Ninja",
        "C" to "Jac"
    )
    println(map)
    println(map.keys)
    println(map.values)

    for ((key, value) in map) {
        println("$key to $value")
    }
}