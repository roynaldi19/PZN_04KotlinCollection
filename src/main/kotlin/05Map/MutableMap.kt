package `05Map`

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf(
        "A" to "Roynaldi",
        "B" to "Ninja",
        "C" to "Jac"
    )

    println(mutableMap["A"])
    println(mutableMap["D"])
    mutableMap.remove("B")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}