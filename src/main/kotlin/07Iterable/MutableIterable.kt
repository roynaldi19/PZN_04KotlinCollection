package `07Iterable`

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {

    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Roynaldi", "Kidd"))
    displayMutableIterable(mutableSetOf("Mugiwara", "Luffy"))
}