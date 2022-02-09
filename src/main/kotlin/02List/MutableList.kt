package `02List`

fun main() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Ryo")
    mutableList.add("Kidd")
    println(mutableList[0])
    println(mutableList[1])

    mutableList[0] = "Roynaldi"
    println(mutableList[0])
    println(mutableList[1])

    mutableList.removeAt(0)
    for (value in mutableList) {
        println(value)
    }

}