package `22TakeDrop`

fun main() {
    val char = ('a'..'z').toList()

    println(char.take(3))
    println(char.takeWhile{ it < 'f'})
    println(char.takeLast(3))
    println(char.takeLastWhile { it > 'x' })

    println(char.drop(13))
    println(char.dropLast(13))
    println(char.dropWhile { it < 'x' })
    println(char.dropLastWhile { it > 'c' })
}