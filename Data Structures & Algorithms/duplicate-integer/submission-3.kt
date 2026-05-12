class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
       val mutableSet = hashSetOf<Int>()
        for(num in nums) {
            val isValid = mutableSet.add(num)
            if (!isValid) {
                return true
            }
        }
        return false
    }
}
