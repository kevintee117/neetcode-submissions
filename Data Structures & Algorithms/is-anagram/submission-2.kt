class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val mapS = mutableMapOf<Char, Int>()
        val mapT = mutableMapOf<Char, Int>()

        //loop through each string
        for(char in s){
            mapS[char] = mapS.getOrDefault(char, 0) + 1
        }
        for( char in t) {
            mapT[char] = mapT.getOrDefault(char, 0) + 1
        }
        return mapS == mapT
        //put each character into a hashmap, with key being the letter and value being the number of occurrences


        //if the two hashmaps are the same, return true, else return false

    }
}
