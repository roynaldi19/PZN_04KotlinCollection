package `39Sequence`

fun main() {
    val words = "the quick brown fox jumps over the lazy dog".split(" ")
    val result = words
        .filter {
        println("filter $it")
        it.length > 3
    }
        .map { println("map $it")
        it.uppercase()
        }
        .take(4)
    println(result)

    println()
    println("====================")
    println()

    val sequence = words.asSequence()
    val resultSequence = words
        .filter {
            println("filter $it")
            it.length > 3
        }
        .map { println("map $it")
            it.uppercase()
        }
        .take(4)
    println(resultSequence)
}