fun getBattery(events: Array<Int>): Int {

    val maxCapacity = 100
    var lastCapacity = 50

    for (i in events.indices) {
        lastCapacity += events[i]

        if (lastCapacity > 100){
            lastCapacity = 100
        }
    }

    return lastCapacity
}