fun main() {
    print(countingValleys(12, "DDUUDDUDUUUD"))
}

fun countingValleys(n: Int, s: String): Int {
    var valleyCounter = 0
    var height = 1

    for (i in 0 until n){
        if (s[i] == 'U') {
            height++
            if (height == 1) {
                valleyCounter++
            }
        } else {
            height--
        }
    }

    return  valleyCounter
}