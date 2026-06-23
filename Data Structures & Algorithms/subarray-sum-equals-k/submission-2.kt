class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var res = 0
        var currSum = 0
        val prefixSums = hashMapOf(0 to 1)
        for(num in nums) {
            currSum += num
            val diff = currSum - k
            res += prefixSums.getOrDefault(diff,0)
            prefixSums[currSum] = prefixSums.getOrDefault(currSum, 0) +1
        }
        return res
    }
}
