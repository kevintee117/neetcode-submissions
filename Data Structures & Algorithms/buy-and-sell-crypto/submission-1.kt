class Solution {
    fun maxProfit(prices: IntArray): Int {

        var l = 0
        var r = 1
        var maxProfit = 0
        while(r < prices.size) {
            if(prices[r] > prices[l]) {
                maxProfit = maxOf(prices[r] - prices[l], maxProfit)
            } else {
                l = r
            }
            r++
        }
        return maxProfit
    }
}
