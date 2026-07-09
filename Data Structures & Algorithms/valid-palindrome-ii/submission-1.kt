class Solution {
    fun validPalindrome(s: String): Boolean {
        //check to see if current string is a palindrome
        if(checkPalindrome(s)) {
            return true
        }
        var res = false
        //loop through whole string and remove a char and see if it still is a palindrome
        for(i in 0 until s.length-1) {
            val check = s.removeRange(i, i+1)
            println(check)
            res = checkPalindrome(check)
            if(res) {
                return true
            }
            println(res)
        }
        return res

    }

    fun checkPalindrome(s: String): Boolean {
      return s == s.reversed()
    }
}
