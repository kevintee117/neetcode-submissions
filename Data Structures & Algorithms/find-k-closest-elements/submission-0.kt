class Solution {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        var left = 0
        var right = arr.size -1 
        while(right - left >= k) {
            if(abs(x-arr[left]) <= abs(x-arr[right])) {
                right--
            } else {
                left++
            }
        }
    
        return arr.slice(left..right)
    }
}
