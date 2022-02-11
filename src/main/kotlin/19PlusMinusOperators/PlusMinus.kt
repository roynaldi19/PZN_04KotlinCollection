package `19PlusMinusOperators`

fun main() {
    val list1 = listOf("Roy", "Naldi", "Kiddo")
    val list2 = list1 + "C.Ronaldo"
    val list3 = list1 + listOf("Messi", "Luffy", "Nobita")
    val list4 = list3 - "Nobita"

    println(list1)
    println(list2)
    println(list3)
    println(list4)
}