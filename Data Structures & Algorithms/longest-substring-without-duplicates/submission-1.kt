class Solution {
    //optimal solution
    fun lengthOfLongestSubstring(s: String): Int {
        val mp = HashMap<Char, Int>()
        var l = 0
        var res = 0
        for(i in s.indices) {
            if(s[i] in mp) {
                if((mp[s[i]]!! + 1) > l) {
                    l = mp[s[i]]!! + 1
                }
            }
            mp[s[i]] = i
            res = maxOf(res, i - l + 1)
        }
    return res
    }
}
