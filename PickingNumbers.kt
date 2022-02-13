import java.util.Collections
import kotlin.math.max

fun main() {

}

fun pickingNumbers(a: Array<Int>): Int {
    val orderedArray = a.sortedArray()
    val setOfArray = orderedArray.toSet().toIntArray()
    val length: MutableList<Int> = mutableListOf()

    if (setOfArray.size == 1) {
        length.add(orderedArray.size)
    } else {
        for (i in 0 until setOfArray.size - 1) {
            if (setOfArray[i + 1] - setOfArray[i] == 1) {
                val firstElement = setOfArray[i + 1]
                val secondElement = setOfArray[i]

                val count = countMemberOnList(orderedArray, firstElement) + countMemberOnList(orderedArray, secondElement)
                length.add(count)
            }
        }
    }

    return length.max()!!
}

fun countMemberOnList(list: Array<Int>, value: Int): Int {
    var count = 0

    for (i in list.indices) {
        if (value == list[i]) {
            count += 1
        }
    }

    return count
}