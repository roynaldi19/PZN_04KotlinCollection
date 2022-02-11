package `36ListSpecificOperations`

fun main() {
    val list = listOf("Roy", "Naldi", "Kiddo", "Ronaldinho")

    println(list[1])
    println(list.getOrNull(10))
    println(list.getOrElse(10){index -> "Tidak Ada"})
    println(list.subList(0, 2))

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Roy"))
    println()

    val numbers = listOf(1,1,2,2,3,3,4,4,5,5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 3 })

}