class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
         val res = mutableMapOf<String, MutableList<String>>()

        for (s in strs) {
            val sortedS = s.toCharArray().sorted().joinToString("")
            res.getOrPut(sortedS) { mutableListOf() }.add(s)
        }

        return res.values.toList()
    }
}
