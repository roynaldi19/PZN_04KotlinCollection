package `07Iterable`

fun <T> displayIterable(iterable: Iterable<T>) {

    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        println(value)
    }

}

fun main() {
    displayIterable(listOf("Roynaldi", "Kidd"))
    displayIterable(setOf("Mugiwara", "Luffy"))
}