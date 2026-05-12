class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) {
            return false
        }
        val hashMapS = HashMap<String, Int>()
        for (char in s) {
            hashMapS[char.toString()] = hashMapS.getOrDefault(char.toString(), 0) + 1
        }
        val hashMapT = HashMap<String, Int>()
        for (char in t) {
            hashMapT[char.toString()] = hashMapT.getOrDefault(char.toString(), 0) + 1
        }
        return hashMapS == hashMapT

    }
}
