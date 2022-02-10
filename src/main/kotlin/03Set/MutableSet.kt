package `03Set`

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf(
        Person("Roy"), Person("Kidd"), Person("Roy"), Person("Kidd"), Person("Roy")
    )

    mutableSet.add(Person("Chika"))
    println(mutableSet.size)
    println(mutableSet.contains(Person("Kidd")))

    for (person in mutableSet) {
        println(person)
    }
}