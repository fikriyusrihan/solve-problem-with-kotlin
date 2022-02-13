import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the freqQuery function below.
fun freqQuery(queries: Array<Array<Int>>): Array<Int> {

    val returnArray = mutableListOf<Int>()
    val dictionary: HashMap<Int, Int> = hashMapOf()

    for (i in queries.indices) {
        if (queries[i][0] == 1) {
            // Add Operation
            dictionary[queries[i][1]] = dictionary.getOrDefault(queries[i][1], 0) + 1
        } else if (queries[i][0] == 2) {
            // Delete Operation

            if (dictionary.getOrDefault(queries[i][1], 0) > 1) {
                dictionary[queries[i][1]] = dictionary.getOrDefault(queries[i][1], 0) - 1
            } else {
                dictionary.remove(queries[i][1])
            }

        } else {
            // Count Frequency
            if (dictionary.containsValue(queries[i][1])) {
                returnArray.add(1)
            } else {
                returnArray.add(0)
            }
        }
    }

    return returnArray.toTypedArray()

}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    val queries = Array<Array<Int>>(q, { Array<Int>(2, { 0 }) })

    for (i in 0 until q) {
        queries[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val ans = freqQuery(queries)

    println(ans.joinToString("\n"))
}
