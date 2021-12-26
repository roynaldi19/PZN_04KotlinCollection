package `06Collection`

fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
    displayCollection(mutableListOf("Roynaldi", "Kidd"))
    displayCollection(mutableSetOf("Luffy", "Muhiwara"))


//    maps tidak bisa karna bukan tutunan colection
//    displayCollection(mapOf("Roy" to "Jack"))
}