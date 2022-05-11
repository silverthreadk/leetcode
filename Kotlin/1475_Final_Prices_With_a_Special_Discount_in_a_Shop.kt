class Solution {

    fun finalPrices(prices: IntArray): IntArray {
        val result = IntArray(prices.size)
        val s = Stack<Int>()
        
        for(i in prices.lastIndex downTo 0) {
            while(!s.isEmpty() && prices[s.peek()] > prices[i]) {
                s.pop()
            }
            result[i] = if(s.isEmpty()) prices[i] else prices[i] - prices[s.peek()]
            s.push(i)
        }
        
        return result
    }
}