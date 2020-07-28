// Complete the circularArrayRotation function below.
fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {

    // a = defaultArray
    // k = times rotation
    // q = index we want to call

    val stepCount = k % a.size
    val returnArray = mutableListOf<Int>()
    var index: Int

    for (i in queries.indices) {
        index = if (queries[i] >= stepCount) {
            queries[i] - stepCount
        } else {
            queries[i] + a.size - stepCount
        }
        //println("Index = $index")
        returnArray.add(a[index])
    }

    return returnArray.toTypedArray()
}

fun showArray(array: Array<Int>) {
    for (i in array.indices) {
        print("${array[i]} ")
    }

    println()
}


fun main() {
    println(showArray(circularArrayRotation(arrayOf(1, 2, 3), 2, arrayOf(0, 1, 2))))
}
