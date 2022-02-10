package `06Collection`

fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
    displayMutableCollection(mutableListOf("Roynaldi", "Kidd"))
    displayMutableCollection(mutableSetOf("Luffy", "Muhiwara"))

//    maps tidak bisa karna bukan tutunan colection
//    displayCollection(mapOf("Roy" to "Jack"))
}