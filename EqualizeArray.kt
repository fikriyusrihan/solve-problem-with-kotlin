// Complete the equalizeArray function below.
fun equalizeArray(arr: Array<Int>): Int {

    val dictionary: HashMap<Int, Int> = hashMapOf()
    var maxValue = 1

    for (i in arr.indices) {
        if (dictionary.containsKey(arr[i])) {
            dictionary[arr[i]] = dictionary[arr[i]]!!.plus(1)

            if (dictionary[arr[i]]!! > maxValue) {
                maxValue = dictionary[arr[i]]!!
            }
        }

        else dictionary[arr[i]] = 1
    }

    return arr.size - maxValue

}

fun main() {
    println(equalizeArray(arrayOf(37, 32, 97, 35, 76, 62)))
}