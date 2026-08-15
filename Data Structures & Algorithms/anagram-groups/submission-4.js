class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const mainMap = new Map();
        for (let string of strs) {
            const letterCount = new Array(26).fill(0);
            for(let c of string){
                letterCount[c.charCodeAt(0) - 'a'.charCodeAt(0)] += 1
            }
            const key = letterCount.join(',');
        if (mainMap.has(key)) {
            mainMap.get(key).push(string)
        } else {
            mainMap.set(key, [string])
        }  
        
    }
    return Array.from(mainMap.values())

    }
}
