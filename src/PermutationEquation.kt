// Complete the permutationEquation function below.
fun permutationEquation(p: Array<Int>): Array<Int> {

    val newArray: MutableList<Int> = mutableListOf()

    for (i in p.indices) {
        newArray.add(p.indexOf(p.indexOf(i + 1) + 1) + 1)
    }

    return newArray.toTypedArray()
}

fun main() {
    showArray(permutationEquation(arrayOf(4, 3, 5, 1, 2)))
}

