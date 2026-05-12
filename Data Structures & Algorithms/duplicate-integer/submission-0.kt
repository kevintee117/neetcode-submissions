class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
    val hashMap = HashMap<Int, Boolean>()
        for (element in nums) {
            if(hashMap[element] == true) {
                return true
            }
            hashMap[element] = true
        }
        return false
    }
}
