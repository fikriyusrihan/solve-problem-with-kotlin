fun gradingStudents(grades: Array<Int>): Array<Int> {

    val roundedGrade = mutableListOf<Int>()

    for (i in grades.indices) {
        if (grades[i] >= 38 && grades[i].rem(5) >= 3) {
            val rounded = grades[i] + 5 - grades[i].rem(5)
            roundedGrade.add(rounded)
        } else {
            roundedGrade.add(grades[i])
        }
    }

    return roundedGrade.toTypedArray()

}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}