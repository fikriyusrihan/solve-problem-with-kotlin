// Complete the countTriplets function below.
fun countTriplets(arr: Array<Long>, r: Long): Long {

    val size = arr.size

    var count: Long = 0
    val dictionary: HashMap<Long, Long> = hashMapOf()
    val pairDictionary: HashMap<Long, Long> = hashMapOf()

    for (i in arr.indices) {
        val value = arr[size - 1 - i]

        if (value * r in pairDictionary) {
            count += pairDictionary[value * r]!!
        }

        if (value * r in dictionary) {
            pairDictionary[value] = pairDictionary.getOrDefault(value, 0) + dictionary[value * r]!!
        }

        dictionary[value] = dictionary.getOrDefault(value, 0) + 1
    }



    return count
}

fun main(args: Array<String>) {
    val nr = readLine()!!.trimEnd().split(" ")

    val n = nr[0].toInt()

    val r = nr[1].toLong()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

    val ans = countTriplets(arr, r)

    println(ans)
}
