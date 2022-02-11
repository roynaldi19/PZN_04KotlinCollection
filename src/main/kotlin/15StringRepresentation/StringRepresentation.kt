package `15StringRepresentation`

fun main() {
    val list1: List<String> = listOf("Roy", "Naldi", "Kidd")
    val string1: String = list1.joinToString(" ","|","|"){ it.uppercase()}
    println(string1)
}