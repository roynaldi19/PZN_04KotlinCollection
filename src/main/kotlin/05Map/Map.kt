package `05Map`

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("A" , "Roynaldi"),
        "B" to "Ninja",
        "C" to "Jac"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }
}