import kotlin.math.max

fun main() {
    println(arrayManipulation(5, arrayOf(arrayOf(2,6,8), arrayOf(3,5,7), arrayOf(1,8,1), arrayOf(5,9,15))))
}

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    val indexOfMax = mutableListOf<Int>()
    var maximumValue = 0

    for (i in queries.indices) {
        for (j in queries[i][0] - 1 until queries[i][1]) {
            if (isElement(indexOfMax, j)) {
                indexOfMax.removeAll(indexOfMax)
                indexOfMax.add(j)
                maximumValue += queries[i][2]
            } else {
                if (maximumValue < queries[i][2]) {
                    maximumValue = queries[i][2]
                    indexOfMax.add(j)
                }
            }
        }
    }
    return 0
}

fun isElement(arr: MutableList<Int>, element: Int): Boolean {
    var value = false;
    for (i in arr.indices) {
        value = true
    }

    return value
}