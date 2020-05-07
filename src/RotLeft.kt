fun rotLeft(a: Array<Int>, d: Int): IntArray {
    val newList = a.toMutableList()
    var temp = 0

    for (i in 0 until d){
        temp = a[i]
        newList.add(temp)
        newList.removeAt(0)
    }

    return newList.toIntArray()
}