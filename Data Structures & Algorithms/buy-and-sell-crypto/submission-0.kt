class Solution {
    fun maxProfit(prices: IntArray): Int {
    
        var maxProfit = 0
        for (i in 0 until prices.size) {
            for (j in prices.size - 1 downTo i) {
                maxProfit = maxOf(prices[j] - prices[i], maxProfit)
            }
        }
        return maxProfit
    }
}
