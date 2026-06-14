class Solution {
    //optimal solution
    fun lengthOfLongestSubstring(s: String): Int {
        //hashmap to keep track of the indices of where each char is at to calculate the longest substring
        val mp = HashMap<Char, Int>()
        var l = 0
        var res = 0
        //loop through the string 
        for(i in s.indices) {
            //if an char is in the hashmap, update the left boundary
            if(s[i] in mp) {
                //check to make sure that the new left boundary doesnt go backwards
                if((mp[s[i]]!! + 1) > l) {
                    l = mp[s[i]]!! + 1
                }
            }
            //add the index of the char to the hashtable
            mp[s[i]] = i
            //result to keep track of the length of the longest substring
            res = maxOf(res, i - l + 1)
        }
    return res
    }
}
