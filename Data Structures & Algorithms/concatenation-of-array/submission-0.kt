class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val newArray = nums.copyOf()
        return nums + newArray
    }
}
