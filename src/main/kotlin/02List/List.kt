package `02List`

fun main() {
    val list: List<String> = listOf("Roynaldi", "Kidd", "Eko")

    println(list.get(0))
    println(list.get(1))
    println(list.get(2))
    println(list.indexOf("Roymaldi"))
    println(list.indexOf("Joko"))
    println(list.contains("Roynaldi"))
    println(list.contains("Erick"))
    println(list.isEmpty())
    println(list.isNotEmpty())
}