fun saveThePrisoner(n: Int, m: Int, s: Int): Int {

    val mod = m.rem(n)

    var lastPosition = 0
    var afterCycle = 0

    afterCycle = if (s - 1 == 0) {
        n
    } else {
        s - 1
    }


    lastPosition = if (afterCycle + mod > n) {
        afterCycle + mod - n
    } else {
        afterCycle + mod
    }

    return lastPosition

}

fun main() {
    println(saveThePrisoner(7, 19, 2))
    println(saveThePrisoner(3, 7, 3))
    println(saveThePrisoner(352926151, 380324688, 94730870))
}