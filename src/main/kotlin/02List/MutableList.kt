package `02List`

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Ryo")
    mutableList.add("Kidd")

    println(mutableList.get(0))
    println(mutableList.get(1))
    println()

    mutableList.set(0,"Roynaldi")
    println(mutableList.get(0))
    println(mutableList.get(1))

    mutableList.removeAt(0)
    println()

    for (value in mutableList) {
        println(value)
    }

}