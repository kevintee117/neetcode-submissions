class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val count = mutableMapOf<Int, Int>()
        val buckets = List(nums.size + 1) { mutableListOf<Int>() }

        // create a hashmap where the key is the number and the value is the number of occurrences
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }

        // create a bucket array where the index is the frequency
        // and the value at that index is a list of all numbers that occur that many times
        for ((num, cnt) in count) {
            buckets[cnt].add(num)
        }

        val result = mutableListOf<Int>()
        // loop through the buckets array from the end (highest frequency) to the start
        // end at index 1 because index 0 would represent numbers occurring 0 times, which never happens
        for (i in buckets.size - 1 downTo 1) {
            // for each number in this frequency bucket, add it to the result
            for (num in buckets[i]) {
                result.add(num)
                // check after EVERY individual addition, not after the whole bucket —
                // a bucket can contain multiple numbers, so checking only after the
                // bucket finishes risks overshooting past k before the check ever runs
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }
        return result.toIntArray()
    }
}
