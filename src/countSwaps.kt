fun main() {
    val array = arrayOf(3, 2, 1)

    countSwaps(array)

}

fun countSwaps(a: Array<Int>): Unit {
    var counter: Int = 0
    var temp = 0

    for (i in 0 until a.size - 1) {
        for (j in i + 1 until a.size) {
            if (a[i] > a[j]) {
                temp = a[i]
                a[i] = a[j]
                a[j] = temp

                counter++
            }
        }
    }

    println("Array is sorted in $counter swaps.")
    println("First element: ${a[0]}")
    println("Last element: ${a[a.size - 1]}")

}