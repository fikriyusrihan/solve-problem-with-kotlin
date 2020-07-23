// Complete the circularArrayRotation function below.
fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {

    var rotatedArray: Array<Int> = a
    val returnArray: MutableList<Int> = arrayListOf()

    for (i in 0 until k) {
        rotatedArray = rotateArray(rotatedArray)
    }

    for (i in queries.indices) {
        returnArray.add(rotatedArray[queries[i]])
    }

    return returnArray.toTypedArray()
}

fun rotateArray(array: Array<Int>): Array<Int> {

    val newArray = array.toMutableList()
    newArray.add(0, array[array.lastIndex])
    newArray.removeAt(array.size)

    return newArray.toTypedArray()
}

fun showArray(array: Array<Int>) {
    for (i in array.indices) {
        print("${array[i]} ")
    }

    println()
}

fun main() {
    println(showArray(rotateArray(arrayOf(2, 4, 6, 8))))
    println(showArray(circularArrayRotation(arrayOf(1, 2, 3), 2, arrayOf(0, 1, 2))))
}