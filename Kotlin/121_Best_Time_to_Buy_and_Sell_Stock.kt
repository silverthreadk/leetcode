class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var minPrice = Int.MAX_VALUE
        
        prices.forEach {
            minPrice = minOf(minPrice, it)
            result = maxOf(result, it - minPrice)
        }
        
        return result
    }
}