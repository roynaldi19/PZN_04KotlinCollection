package `08Iterator`

fun<T> displayMutableIterator(mutableListIterator: MutableListIterator<T>){
    while (mutableListIterator.hasNext()) {
        println(mutableListIterator.next())
    }
}

fun removeOddNUmber(mutableListIterator: MutableListIterator<Int>){
    while (mutableListIterator.hasNext()){
        val value = mutableListIterator.next()
        if (value % 2 == 1){
            mutableListIterator.remove()
        }
    }
}

fun main() {
    val mutableList = mutableListOf(1,2,3,4,5,6,7,8,9)
    removeOddNUmber(mutableList.listIterator())
    displayMutableIterator(mutableList.listIterator())
}