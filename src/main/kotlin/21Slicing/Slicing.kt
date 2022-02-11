package `21Slicing`

fun main() {
    val list1 = (0..10).toList()
    val list2 = list1.slice(0..5)
    val list3 = list1.slice(0..10 step 2)
    val list4 = list1.slice(10 downTo 0 step 2)

    println(list1)
    println(list2)
    println(list3)
    println(list4)
}