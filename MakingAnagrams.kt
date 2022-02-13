// Complete the makeAnagram function below.
fun makeAnagram(a: String, b: String): Int {

    val aInArray = a.toMutableList()
    val bInArray = b.toMutableList()

    var i = 0
    var j: Int

    while (i < aInArray.size) {
        var isDeleted = false
        j = 0
        while (j < bInArray.size) {
            if (aInArray[i] == bInArray[j]) {
                aInArray.removeAt(i)
                bInArray.removeAt(j)
                isDeleted = true
                break
            } else {
                j++
            }
        }

        if (!isDeleted) {
            i++
        }
    }

    return aInArray.size + bInArray.size
}

fun showArray(array: Array<Char>) {
    for (i in array.indices) {
        print("${array[i]} ")
    }
}

fun main() {
    println(makeAnagram("hai", "hiya"))
}