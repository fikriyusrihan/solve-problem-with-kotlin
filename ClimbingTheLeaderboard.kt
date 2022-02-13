fun main() {
    showArray(climbingLeaderboard2(arrayOf(100, 100, 50, 40, 40, 20, 10), arrayOf(5, 25, 50, 120)).toTypedArray())
}

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): List<Int> {
    val setOfScores = scores.toSortedSet()
    var size: Int
    val rankAliceList: MutableList<Int> = mutableListOf()

    for (i in alice.indices) {
        val element = alice[i]
        setOfScores.add(element)
        size = setOfScores.size
        rankAliceList.add(size - setOfScores.indexOf(element))
    }

    return rankAliceList.toList()
}

fun climbingLeaderboard2(scores: Array<Int>, alice: Array<Int>): List<Int> {
    val newScore = scores.toSortedSet()
    val newSortedSetArray = newScore.toTypedArray()
    val rankAliceList = mutableListOf<Int>()

    val size = newSortedSetArray.size

    for (i in alice.indices) {
        for (j in newSortedSetArray.indices) {
            if (alice[i] == newSortedSetArray[j]) {
                rankAliceList.add(j - 1)
                break
            } else if (alice[i] < newSortedSetArray[j]) {
                rankAliceList.add(size - j + 1)
                break
            } else {
                if (j == size - 1) {
                    rankAliceList.add(1)
                }
            }
        }
    }

    return rankAliceList
}