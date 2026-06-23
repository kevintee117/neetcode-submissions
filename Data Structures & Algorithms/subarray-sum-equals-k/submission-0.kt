class Solution {
    //brute force solution
    fun subarraySum(nums: IntArray, k: Int): Int {
        var result = 0
        for(i in nums.indices) {
            var sum = 0
            for(j in i until nums.size) {
                sum += nums[j]
                if(sum == k) {
                    result++
                }
            }
        }
        return result
    }
}
