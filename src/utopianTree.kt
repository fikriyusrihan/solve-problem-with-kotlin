// Complete the utopianTree function below.
fun utopianTree(n: Int): Int {
    var treeHeight = 1

    for (i in 1..n) {
        if (i.rem(2) == 1) {
            treeHeight *= 2
        } else {
            treeHeight += 1
        }
    }

    return treeHeight
}

fun main() {
    println(utopianTree(60))
}