fun twoSum(nums: IntArray, target: Int): IntArray {

    val dictionary: HashMap<Int, Int> = hashMapOf()

    for (i in nums.indices) {

        val second = target - nums[i]
        if (dictionary.containsKey(second)) {
            return intArrayOf(dictionary[second]!!, i)
        }

        dictionary[nums[i]] = i

    }

    return intArrayOf()
}

fun main() {
    twoSum(intArrayOf(3, 2, 4), 6)
}