class Solution {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
 var l = 0
        var r = arr.size - k
        while (l < r) {
            val m = (l + r) / 2
            if (x - arr[m] > arr[m + k] - x) {
                l = m + 1
            } else {
                r = m
            }
        }
        return arr.slice(l until l + k)
    }
}
