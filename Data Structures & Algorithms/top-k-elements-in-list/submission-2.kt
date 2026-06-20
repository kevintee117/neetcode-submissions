class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val count = mutableMapOf<Int,Int>()
        val buckets = List(nums.size+1) { mutableListOf<Int>() }

        //create a hashmap where the key is the number and the value is the number of occurrences
        for(num in nums) {
            count[num] = count.getOrDefault(num,0) +1
        }

        //create a bucket array where the index is the 
        //number of frequencies and the values in the array
        // is an arraylist that contains the numbers that occur i times

        for((num,cnt) in count) {
            buckets[cnt].add(num)
        }

        val result = mutableListOf<Int>()
        //loop through the buckets array from the end to the start
        //end at index 1 because index 0 is always empty
        for (i in buckets.size - 1 downTo 1) {
            //for each non empty array list in the freq array,
            // add it to the result array
            for(num in buckets[i]) {
                result.add(num)
            }
            //once the size of the array is equal to k
            //return the result
            if(result.size == k) {
                return result.toIntArray()
            }

        }
        return result.toIntArray()

    }
}
