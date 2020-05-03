fun main() {
    print(jumpingOnClouds(arrayOf(0, 0, 0, 1, 0, 0)))
}

fun jumpingOnClouds(c: Array<Int>): Int {
    val listOfCloud = c.toMutableList()
    var jumpCounter = 0
    val i = 0

    while (listOfCloud.size > 2) {
        if (listOfCloud[i + 1] == 0 && listOfCloud[i + 2] == 0) {
            jump(listOfCloud, 2)
            jumpCounter++
        } else if (listOfCloud[i + 1] == 1) {
            jump(listOfCloud, 2)
            jumpCounter++
        } else if (listOfCloud[i + 1] == 0) {
            jump(listOfCloud, 1)
            jumpCounter++
        }
    }

    if (listOfCloud.size == 2){
        jumpCounter++
    }

    return jumpCounter
}

fun jump(list: MutableList<Int>, times: Int) {
    for (i in 0 until times) {
        list.removeAt(i)
    }
}