package `11Mapping`

fun main() {
    val list: List<String> = listOf("Roy", "naldi", "Kidd")
    val list2 = list.map { it.uppercase() }
    println(list2)

    val set: Set<String> = setOf("Roy", "naldi", "Kidd")
    val set2 = set.map { it.lowercase() }
    println(set2)

    val names = listOf("Eko", "Joko", "Budi", "Arif", "Angga", "Edo")
    val namesGanjil = names.mapIndexedNotNull { index, names ->
        if (index % 2 == 0) null
        else names
    }
    println(namesGanjil)

    val numbers = (1..10).toList()
    val numbersGanjil = numbers.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(numbersGanjil)
}


