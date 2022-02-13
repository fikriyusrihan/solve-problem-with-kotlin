// Complete the beautifulTriplets function below.
fun beautifulTriplets(d: Int, arr: Array<Int>): Int {

    var counter = 0

    for (i in arr.indices) {
        val x = arr[i] + d
        val y = x + d
        if (arr.contains(x) && arr.contains(y)) counter++
    }

    return counter
}

fun main() {
    println(beautifulTriplets(3, arrayOf(1, 2, 4, 5, 7, 8, 10)))
}