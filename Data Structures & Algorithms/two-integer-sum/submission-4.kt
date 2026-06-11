class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //nums[j] = target - nums[i]
        //key is "j" and 
        val map = mutableMapOf<Int, Int>()
        for(i in nums.indices) {
            var currDiff = target - nums[i]
            print("\n currDiff: $currDiff")
            if(currDiff in map) {
                return intArrayOf(map[currDiff]!!, i)
            } else {
                map[nums[i]] = i
                print("\n key: ${nums[i]} value: $i ")
            }
        }
        return intArrayOf(0,0)

    }
}
