package `08Iterator`

fun<T> displayIterator(listIterator: ListIterator<T>){
    println("Display Next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    println("Display Previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

fun main() {
    displayIterator(listOf("Roy", "Naldi", "Kidd").listIterator())
}