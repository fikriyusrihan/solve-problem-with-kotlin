fun main() {
    println(minimumSwaps(arrayOf(3, 7, 6, 9, 1, 8, 10, 4, 2, 5)))
}

fun minimumSwaps(arr: Array<Int>): Int {
    var swapCounter = 0

    for (i in arr.indices) {
        for (j in i+1 until arr.size - 1) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp

                swapCounter++
            }
        }
    }

    return swapCounter
}