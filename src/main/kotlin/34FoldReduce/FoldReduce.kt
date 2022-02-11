package `34FoldReduce`

fun main() {
    val numbers = (1..100).toList()
    val max = numbers.reduce { acc, i ->
        if (acc < i) i
        else acc
    }

    val sum  = numbers.fold(0) { acc, i ->
        acc + i
    }
    println(max)
    println(sum)
}