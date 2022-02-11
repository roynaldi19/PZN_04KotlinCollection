package `14Flattening`

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Roy", "Naldi", "Kidd"),
        listOf("Kotlin", "xml", "android")
    )
    val list2: List<String> = list.flatten()
    println(list2)
}