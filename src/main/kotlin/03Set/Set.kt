package `03Set`

fun main() {
    val set: Set<Person> = setOf(
        Person("Roy"),Person("Kidd"),Person("Roy"),Person("Kidd"),Person("Roy")
    )


    println(set.size)
    println(set.contains(Person("Kidd")))
    println()

    for (person in set) {
        println(person)
    }
}