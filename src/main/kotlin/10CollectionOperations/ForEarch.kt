package `10CollectionOperations`

fun main() {
    listOf("Roy", "Naldi", "Kidd").forEach{
        println(it)
    }

    mutableListOf("Roy", "Naldi", "Kidd").forEachIndexed{ index, value ->
        println("$index $value")
    }
}