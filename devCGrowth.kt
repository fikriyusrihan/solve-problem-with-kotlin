import kotlin.math.ceil

fun devCGrowth(N: Int, D: Int): Int {
    val targetMember = 10000
    val untilTarget = targetMember - N

    val days = (untilTarget.toDouble() / D.toDouble())

    return ceil(days).toInt()
}

fun main() {
    println(berapaKaryawan(arrayOf(0, 1, 1, 2, 2, 2, 6, 6), arrayOf(3, 4, 8)))
}

fun berapaKaryawan(atasan: Array<Int>, proyek: Array<Int>): Int {

    val orangTerlibat = mutableSetOf<Int>()

    for (i in proyek.indices) {
        orangTerlibat.add(proyek[i])

        var atasanSekarang = atasan[proyek[i] - 1]
        while (atasanSekarang != 0) {
            orangTerlibat.add(atasanSekarang)
            atasanSekarang = atasan[atasanSekarang - 1]
        }
    }

    return orangTerlibat.size
}