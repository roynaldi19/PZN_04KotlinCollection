package `09KonversiCollection`

fun main() {
    val array = arrayOf(1,2,3,4,5,6,7,8,9,10,4,3,6,4,6,34,)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableList = range.toMutableList()
    val mutableSet = range.toMutableSet()

    val sortedSet= array.toSortedSet()

    println(sortedSet)

}