package `02List`

fun main() {
    val list: List<String> = listOf("Roynaldi", "Kidd", "Eko")

    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Roynaldi"))
    println(list.indexOf("Joko"))
    println(list.contains("Roynaldi"))
    println(list.contains("Erick"))
    println(list.containsAll(listOf("Roynaldi", "Kidd")))
    println(list.isEmpty())
    println(list.isNotEmpty())

}