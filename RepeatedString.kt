import kotlin.math.floor

fun main() {
    println(repeatedString("gfcaaaecbg", 547602))
}

fun repeatedString(s: String, n: Long): Long {
    val word = s.toCharArray().toMutableList()
    var firstCharCount = 0
    var modFirstCharCount = 0

    for (i in 0 until word.size) {
        if ('a' == s[i]) {
            firstCharCount++
        }
    }

    val div = floor((n / word.size).toDouble())
    var mod: Long = n % word.size - 1

    while (mod >= 0) {
        if ('a' == s[mod.toInt()]) {
            modFirstCharCount++
        }
        mod--
    }


    //println("F = ${firstCharCount * div}, M = $modFirstCharCount")
    return ((firstCharCount * div) + modFirstCharCount).toLong()
}

