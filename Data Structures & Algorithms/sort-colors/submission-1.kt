class Solution {
    fun sortColors(nums: IntArray) {
        //count number of 0's, 1's and 2's in array
        var count0 = 0
        var count1 = 0
        var count2 = 0
        for(num in nums) {
            if(num == 0) {
                count0++
            }
            else if(num == 1) {
                count1++
            }
            else if (num == 2) {
                count2++
            }
        }
        for(i in nums.indices) {
            var curr = nums[i]
            if(count0 > 0){
                nums[i] = 0
                count0--
            }
            else if(count1 > 0){
                nums[i] = 1
                count1--
            }
            else if(count2 > 0){
                nums[i] = 2
                count2--
            }
        }
    }
}
