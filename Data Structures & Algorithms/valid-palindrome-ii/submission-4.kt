class Solution {
    fun validPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        while (left < right) {
            if(s[left] == s[right]) {
                left++
                right--
            } else {
                val skipL = s.substring(left + 1, right + 1)
                val skipR = s.substring(left, right)
                return checkPalindrome(skipL) || checkPalindrome(skipR)
            }
        }
        return true
    }
    fun checkPalindrome(s: String): Boolean {
      return s == s.reversed()
    }
}
