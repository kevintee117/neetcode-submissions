class Solution {
    fun reverseString(s: CharArray) {

        var end = s.size -1
        for(i in 0 until s.size/2) {
            var curr = s[i]
            s[i] = s[end]
            s[end] = curr
            end--
        }

    }
}
