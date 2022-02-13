import kotlin.math.abs

// Complete the libraryFine function below.
fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    var hackos = 0

    if (y1 == y2) {
        if (m1 == m2) {
            if (d1 <= d2) {
                hackos = 0
            } else {
                hackos = 15 * abs(d2 - d1)
            }
        } else if (m1 < m2) {
            hackos = 0
        }
        else {
            hackos = 500 * abs(m2 - m1)
        }
    } else if (y1 < y2) {
        hackos = 0
    }
    else {
        hackos = 10000
    }

    return hackos
}

fun main() {
    println(libraryFine(2, 7, 1014, 1, 1, 1015))
}