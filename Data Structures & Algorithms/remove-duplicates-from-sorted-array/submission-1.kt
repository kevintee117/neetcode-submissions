class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var left = 0
        var right = 0
        while (right < nums.size) {
            nums[left] = nums [right]
            while(right < nums.size && nums[right] == nums[left]) {
                right++
            }
            left++
        }
        return left
    }
}
