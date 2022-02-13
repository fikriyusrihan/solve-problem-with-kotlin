import kotlin.math.abs

// Complete the minimumDistances function below.
fun minimumDistances(a: Array<Int>): Int {

    var minimumDistance: Int? = null

    for (i in a.indices) {
        for (j in i + 1 until a.size) {
            if (a[i] == a[j]) {
                val distance = abs(j - i)
                if (minimumDistance == null || distance < minimumDistance) minimumDistance = distance
                break
            }
        }
    }


    return minimumDistance?: -1
}

fun main() {
    println(minimumDistances(arrayOf(1, 2, 3, 4, 10)))
}