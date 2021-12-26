package `05Map`

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf(
        "A" to "Roynaldi",
        "B" to "Ninja",
        "C" to "Jac"
    )

    println(mutableMap.get("A"))
    println(mutableMap.get("D"))
    println(mutableMap.remove("B"))
    println()

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}