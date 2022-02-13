fun main() {
    println(hourglassSum(arrayOf(arrayOf(1,1,1,0,0,0), arrayOf(0,1,0,0,0,0), arrayOf(1,1,1,0,0,0), arrayOf(0,0,2,4,4,0), arrayOf(0,0,0,2,0,0), arrayOf(0,0,1,2,4,0))))

}

fun hourglassSum(arr: Array<Array<Int>>): Int {
    val listOfHourGlassSum = mutableListOf<Int>()
    val height = arr.size
    val width = arr[0].size
    println("height $height")
    var i = 0
    var j = 0

    while (i + 2 < height) {
        j = 0
        while (j + 2 < width) {
            println("i = $i, j = $j")
            listOfHourGlassSum.add(getHourGlass(arr, i, j))
            j++
        }
        i++
    }

    return listOfHourGlassSum.max()!!
}

fun getHourGlass (arr: Array<Array<Int>>, startR: Int, startC: Int) : Int {
    var sum = 0

    for (i in startC until startC + 3) {
        sum += arr[startR][i]
        sum += arr[startR + 2][i]
    }

    sum += arr[startR + 1][startC + 1]

    return sum
}