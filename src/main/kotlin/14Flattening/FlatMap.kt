package `14Flattening`


class Member(val name: String, val hobbies: List<String>)

fun main() {
    val members: List<Member> = listOf(
        Member("Roy", listOf("Coding", "Gaming")),
        Member("Kidd", listOf("Football", "Traveling"))
    )
    val hobies: List<String> = members.flatMap { it.hobbies }
    println(hobies)
}