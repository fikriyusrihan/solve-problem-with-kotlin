import kotlin.math.max

fun main() {

}

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var maxSpend = -1

    for (i in keyboards.indices) {
        for (j in drives.indices) {
            val totalSpend = keyboards[i] + drives[j]
            if (totalSpend in maxSpend..b) {
                maxSpend = totalSpend
            }
        }
    }
    return maxSpend
}