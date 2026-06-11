class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        //most efficient
        //add everything into a hashset and if it exists, return true, else return false
        val set = mutableSetOf<Int>()
        for(num in nums) {
            if(num in set) {
                return true
            } else {
                set.add(num)
            }
        }
        return false

    
    }
}
