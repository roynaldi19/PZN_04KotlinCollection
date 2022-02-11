package `31ReverseOrder`

fun main() {
    val list1 = mutableListOf("Roy", "Naldi", "Kiddo")
    val listReverse = list1.reversed()
    val listAsReverse = list1.asReversed()
    list1.add("Kotlin")
    println(listReverse)
    println(listAsReverse)
}