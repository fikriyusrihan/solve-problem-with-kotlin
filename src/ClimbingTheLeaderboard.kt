fun main() {

}

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): List<Int> {
    val setOfScores = scores.toMutableSet().toSortedSet()
    val rankAliceList: MutableList<Int> = mutableListOf()

    for (i in alice.indices) {
        val element = alice[i]
        setOfScores.add(element)
        val size = setOfScores.size
        rankAliceList.add(size - setOfScores.indexOf(element))
    }

    return rankAliceList.toList()
}