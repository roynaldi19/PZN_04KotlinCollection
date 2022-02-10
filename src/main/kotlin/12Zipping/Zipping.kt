package `12Zipping`

fun main() {
    val list1: List<Int> = listOf(1,2,3)
    val list2: List<String> = listOf("Roy", "Naldi", "Kidd")
    val list3: List<Pair<Int, String>> = list1.zip(list2)
    println(list3)
}