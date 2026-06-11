class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //nums[j] = target - nums[i]
        //key is difference, value is index
        val map = mutableMapOf<Int, Int>()
        for(i in nums.indices) {
            var currDiff = target - nums[i]
            if(currDiff in map) {
                return intArrayOf(map[currDiff]!!, i)
            } else {
                map[nums[i]] = i
            }
        }
        return intArrayOf(0,0)

    }
}
