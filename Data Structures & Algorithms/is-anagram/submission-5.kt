class Solution {
    //different solution
    fun isAnagram(s: String, t: String): Boolean {
        //if the strings are not the same length, they cannot be anagrams
        if(s.length != t.length) {
            return false
        }
        //sort each string
        val sortedStringS = s.toCharArray().sorted().joinToString("") 
        val sortedStringT = t.toCharArray().sorted().joinToString("")

        //if the strings match then its an anagram, if not then its not an anagram
        return sortedStringS == sortedStringT
        }   
}
