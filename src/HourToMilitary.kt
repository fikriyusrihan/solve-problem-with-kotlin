import kotlin.math.abs

// Complete the hurdleRace function below.
fun hurdleRace(k: Int, height: Array<Int>): Int {

    val maxHeight = height.max()!!
    val doses = abs(maxHeight - k)

    return if (k >= maxHeight) {
        0
    } else {
        doses
    }

}