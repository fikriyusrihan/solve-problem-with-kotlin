fun minimumBribes(q: Array<Int>): Unit {
    var bribesCounter  = 0

    for (i in q.indices) {
        if (q[i] - (i+1) > 2) {
            println("Too chaotic")
            return
        }

        for (j in 0 until maxOf(0, q[i] - 2, i)) {
            if (q[j] > q[i]) {
                bribesCounter += 1
            }
        }
    }

    println("$bribesCounter")
}