class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        //brute force solution

        if (nums.isEmpty()) return 0

        nums.sort()
        var result = 1
        var current = 1

        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                continue // skip duplicates, don't break the streak
            } else if (nums[i] == nums[i - 1] + 1) {
                current++
            } else {
                current = 1 // streak broken, reset and start counting again
            }
            result = maxOf(result, current)
        }
        return result
    }
}
