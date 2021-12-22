class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var result = 0
        for(i in 1 until timeSeries.size) {
            result += minOf(timeSeries[i] - timeSeries[i-1], duration)
        }
        result += duration
        
        return result
    }
}