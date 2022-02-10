package `12Zipping`

fun main() {
    val list: List<Pair<Int, String>> = listOf(
        1 to "Roy",
        2 to "Naldi",
        3 to "Kidd"
    )

    val pair: Pair<List<Int>, List<String>> = list.unzip()
    println(pair)
}