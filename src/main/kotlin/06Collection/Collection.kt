package `06Collection`

fun <T> displayCollection(collection: Collection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Roynaldi", "Kidd"))
    displayCollection(setOf("Luffy", "Muhiwara"))


//    maps tidak bisa karna bukan tutunan colection
//    displayCollection(mapOf("Roy" to "Jack"))
}