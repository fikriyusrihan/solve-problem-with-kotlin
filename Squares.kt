import kotlin.math.sqrt

// Complete the squares function below.
fun squares(a: Int, b: Int): Int {

    var count = 0
    var x = 1

    while (x * x < a) x++
    while (x * x <= b) {
        x++
        count++
    }

    return count
}

fun main() {
    println(squares(3, 9))
}