package `40PropertiesMap`

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}

fun main() {
    val application = Application(mapOf("name" to "kotlinApp", "version" to 1))
    println(application.name)
    println(application.version)
}
