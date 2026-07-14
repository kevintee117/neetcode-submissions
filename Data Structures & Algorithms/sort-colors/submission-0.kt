class Solution {
    fun sortColors(nums: IntArray) {
        for (i in 1 until nums.size) {
            val key = nums[i]
            var j = i - 1
            
            // Move elements that are greater than key to one position ahead
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j]
                j--
            }
            nums[j + 1] = key
        }
    }
}
