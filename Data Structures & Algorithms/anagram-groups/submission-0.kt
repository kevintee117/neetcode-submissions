class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        /*
        - can take each string in array
        - sort it and store it as key in array, with values being list of strings with the same
        - print out all the values of hashmap
        */
        val map = mutableMapOf<String, MutableList<String>>()
        for(str in strs) {
            var sortedString = str.toCharArray().sorted().joinToString("")
            if(sortedString in map) {
                map[sortedString]?.add(str)
            } else {
                map[sortedString] = mutableListOf(str)
            }
        }
        return map.values.toList()

    }
}
