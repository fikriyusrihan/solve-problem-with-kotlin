// Complete the appendAndDelete function below.
fun appendAndDelete(s: String, t: String, k: Int): String {

    var deleteCounter = 0
    var addCounter = 0
    var sameCounter = 0


    if (s.length > t.length) {
        for (i in t.indices) {
            if (s[i] == t[i]) {
                sameCounter++
            } else {
                break
            }
        }

    } else {
        for (i in s.indices) {
            if (s[i] == t[i]) {
                sameCounter++
            } else {
                break
            }
        }
    }


    deleteCounter = s.length - sameCounter
    addCounter = t.length - sameCounter

    return if (addCounter + deleteCounter > k) {
        "No"
    } else {
        "Yes"
    }

}

fun main() {
    println(appendAndDelete("y", "yu", 2))
}
