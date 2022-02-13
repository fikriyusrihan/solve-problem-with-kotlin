// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int {

    val newArray = s.toCharArray()
    var i = 0
    var returnValue = 0

    while (i < newArray.size) {
        try {
            if (newArray[i] == newArray[i + 1]) {
                returnValue++
            }
        } catch (e: Exception) {
        }

        i++
    }

    return returnValue

}

// Complete the findDigits function below.
fun findDigits(n: Int): Int {
    val integerCharArray = n.toString().toCharArray()
    var returnValue = 0

    for (i in integerCharArray.indices) {
        val number = integerCharArray[i].toInt() - 48
        try {
            if (n % number == 0) returnValue += 1
        } catch (e: Exception) {}
    }

    return returnValue

}

fun main() {
    println(findDigits(1012))
}