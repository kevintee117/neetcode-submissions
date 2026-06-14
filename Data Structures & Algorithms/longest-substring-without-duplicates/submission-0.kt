class Solution {
    //brute force solution
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        for(i in s.indices) {
        val charSet = mutableSetOf<Char>()
           for (j in i until s.length) {
            if (s[j] in charSet) {
                break
            }
            charSet.add(s[j])
        }
        result = maxOf(result, charSet.size)
    }
    return result
    }
}
