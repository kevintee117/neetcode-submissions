class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        //brute force, check every index and compare to k
        for(i in 0 until nums.size-1) {
            for(j in i + 1 until nums.size) {
                if(nums[i] == nums[j] && abs(i-j) <= k) {
                    return true
                }
            }
        }
        return false
    }
}
