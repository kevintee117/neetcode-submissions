class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numsSet = nums.toSet()

        var longest = 0
        for(num in numsSet) {
            if((num -1) !in numsSet) {
                var length = 1 
                while ((num+length in numsSet)) {
                    length++
                }
                longest = maxOf(longest, length)
            }
        }
        return longest
    }
}
