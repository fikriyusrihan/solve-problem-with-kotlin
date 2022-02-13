import kotlin.test.currentStackTrace

// Complete the cutTheSticks function below.
fun cutTheSticks(arr: Array<Int>): Array<Int> {

    val countCutAction: MutableList<Int> = mutableListOf()
    val mutableList = arr.toMutableList()

    while (mutableList.size > 0) {
        countCutAction.add(mutableList.size)

        val smallest = mutableList.min()!!
        var i = 0

        while (i < mutableList.size) {
            if (mutableList[i] - smallest == 0) {
                mutableList.removeAt(i)
            } else {
                mutableList[i] = mutableList[i] - smallest
                i++
            }
        }
    }

    return countCutAction.toTypedArray()
}

fun main() {
    println(cutTheSticks(arrayOf(5, 4, 4, 2, 2, 8)).contentToString())
}