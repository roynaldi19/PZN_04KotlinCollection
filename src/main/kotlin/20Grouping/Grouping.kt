package `20Grouping`

fun main() {
    val list = listOf("a", "b", "c", "d", "x","a", "b", "c", "d", "z")
    val map: Map<String, List<String>> = list.groupBy { it }
    val grouping: Grouping<String, String> = list.groupingBy { it }
    println(map)
    println(grouping)
}