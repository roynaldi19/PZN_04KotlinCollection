package `11Mapping`

fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Roy",
        2 to "Naldi",
        3 to "Kidd"
    )

    val mapKeys = map.mapKeys{ it.key * 10}
    println(mapKeys)

    val mapValues = map.mapValues { it.value.uppercase() }
    println(mapValues)
}