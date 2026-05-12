class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        const copy = [...nums]
        return [...nums,...copy]
    }
}
