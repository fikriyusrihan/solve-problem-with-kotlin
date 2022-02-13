import java.lang.Exception
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

fun encryption(s: String): String {
    var rows = floor(sqrt(s.length.toDouble())).toInt()
    val column = ceil(sqrt(s.length.toDouble())).toInt()

    var textIndex = 0
    val textSize = s.length

    if (rows * column < textSize) rows++

    var array: MutableList<Char>
    val matrix: MutableList<MutableList<Char>> = mutableListOf()

    var returnText = ""

    for (i in 0 until rows) {
        array = mutableListOf()

        for (j in 0 until column) {
            if (textIndex < textSize) {
                array.add(s[textIndex])
                textIndex++
            }
        }

        matrix.add(array)
    }

    for (i in 0 until column) {
        for (j in 0 until rows) {
            try {
                returnText += matrix[j][i]
            } catch (e: Exception) {
                break
            }
        }
        returnText += " "
    }

    return returnText
}

fun main() {
    println(encryption("chillout"))
}