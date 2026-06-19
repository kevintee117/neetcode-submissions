class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        //if they are not the same length, they cannot be anagrams
        if(s.length != t.length){
            return false
        }
        //make 2 maps of each
        val mapS = mutableMapOf<Char, Int>()
        val mapT = mutableMapOf<Char, Int>()

        //loop through each string
        for(i in s.indices){
            //put each character into a hashmap, with key being the letter and value being the number of occurrences
            mapS[s[i]] = mapS.getOrDefault(s[i], 0) + 1
            mapT[t[i]] = mapT.getOrDefault(t[i], 0) + 1

        }
        //if the two hashmaps are the same, return true, else return false
        return mapS == mapT



    }
}
