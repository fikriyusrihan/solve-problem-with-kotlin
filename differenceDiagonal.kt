import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(n: Int, arr: Array<Array<Int>>): Int {

    var firstDiagonal = 0
    var secondDiagonal = 0

    // First Diagonal
    for (i in 0 until n) {
        firstDiagonal += arr[i][i]
    }

    // Second Diagonal
    for (i in 0 until n) {
        secondDiagonal += arr[i][n - i - 1]
    }


    return abs(firstDiagonal - secondDiagonal)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(n, arr)

    println(result)
}
