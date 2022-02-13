// Complete the biggerIsGreater function below.

/* Step by step to solve, Fikri Yusihan 28/07/2020
*
*  1. Search char to swap
*  2. Search another char to swap, which greater than 1st char, but the smallest
*  3. Swap
*  4. Sort
*  5. Return
*
*/


fun biggerIsGreater(w: String): String {

    var newString = w.toCharArray()
    val maxIndex = newString.size - 1

    var charToChange: Char?
    var indexCharToChange: Int?
    var anotherChar: Char?
    var indexAnotherChar: Int? = -1

    // Find char and index to change
    for (i in newString.indices) {
        try {
            if (newString[maxIndex - i].toInt() > newString[maxIndex - i - 1].toInt()) {
                indexCharToChange = maxIndex - i - 1
                charToChange = newString[indexCharToChange]
                anotherChar = newString[maxIndex - i]

                // Find another char and index to change
                for (j in indexCharToChange + 1 until newString.size) {
                    if (newString[j].toInt() > charToChange.toInt() && newString[j].toInt() <= anotherChar!!.toInt()) {
                        anotherChar = newString[j]
                        indexAnotherChar = j
                    }
                }

                // Swap
                val temp = newString[indexCharToChange]
                newString[indexCharToChange] = newString[indexAnotherChar ?: maxIndex - i]
                newString[indexAnotherChar ?: maxIndex - i] = temp

                // Sorting and Appending
                val noChangeArray = mutableListOf<Char>()
                val changeArray = mutableListOf<Char>()

                for (l in 0 until indexCharToChange + 1) {
                    noChangeArray.add(newString[l])
                }

                for (m in indexCharToChange + 1 until newString.size) {
                    changeArray.add(newString[m])
                }

                val sortedArray = changeArray.sorted()

                for (n in sortedArray.indices) {
                    noChangeArray.add(sortedArray[n])
                }

                newString = noChangeArray.toCharArray()

                break
            }
        } catch (e: Exception) {
            newString = "no answers".toCharArray()
        }
    }


    return newString.joinToString("")
}

fun main() {
    println(biggerIsGreater("abcd"))
    println(biggerIsGreater("ab"))
}