class Solution {
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        val n = cardPoints.size
        if(n <= k) return cardPoints.sum()
        
        var sum = cardPoints.filterIndexed { index, _ -> index < k }.sum()
        var result = sum
        
        for(i in 0 until k) {
            sum -= cardPoints[k - i - 1]
            sum += cardPoints[n - i - 1]
            result = maxOf(result, sum)
        }
        
        return result
    }
}