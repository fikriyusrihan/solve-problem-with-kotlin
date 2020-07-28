import kotlin.math.abs

fun getMinCost(crew_id: Array<Int>, job_id: Array<Int>): Long {
    // Write your code here
    val newCrew = crew_id.toMutableList()
    val newJob = job_id.toMutableList()

    var jobValue = -1
    var crewValue = -1

    var diff: Int?

    var returnDiff: Long = 0

    for (i in crew_id.indices) {
        diff = null
        for (j in newCrew.indices) {
            for (k in newJob.indices) {
                if (diff == null || diff >= abs(newCrew[j] - newJob[k])) {
                    diff = abs(newCrew[j] - newJob[k])

                    jobValue = newJob[k]
                    crewValue = newCrew[j]

                    println("Crew = $crewValue")
                    println("Job = $jobValue")
                }
            }
        }
        returnDiff += diff ?: 0
        newJob.remove(jobValue)
        newCrew.remove(crewValue)

        println("=================")
    }
    return returnDiff
}

fun main() {
    println(getMinCost(arrayOf(5, 3, 1, 4, 6), arrayOf(9, 8, 3, 15, 1)))
}