class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const mainMap = new Map();
        // mainMap.set(key, []);
        for(const string of strs){
            let sortedString = string.split('').sort().join('');
            if(mainMap.has(sortedString)) {
                mainMap.get(sortedString).push(string)
            } else {
                mainMap.set(sortedString, [string])
            }
        }
        return Array.from(mainMap.values())
    }
}
