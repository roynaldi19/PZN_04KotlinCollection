package `13Association`

fun main() {
    val list: List<String> = listOf("Roy", "Naldi", "Kidd")

    val map: Map<String, Int> = list.associateWith { it.length }
    println(map)
}