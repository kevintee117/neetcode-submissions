class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        //put all elements of nums into set
        val resSet = nums.toSet().sorted()
        for (i in resSet.indices) {
            nums[i] = resSet[i]
        }

        //return set size
        return resSet.size
    }
}
