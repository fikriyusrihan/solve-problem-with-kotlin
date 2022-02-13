// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    var maxHeight = 0

    for (i in word.indices) {
        val index = word[i].toInt() - 97

        if (maxHeight < h[index]) {
            maxHeight = h[index]
        }
    }

    return word.length * maxHeight
}

fun main(){
    println("${'a'.toInt()}")
}