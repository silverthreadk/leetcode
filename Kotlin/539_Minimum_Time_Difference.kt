class Solution {
    fun findMinDifference(timePoints: List<String>): Int {
        val sorted = timePoints.sorted() 
        
        val n = timePoints.size
        var prev = getMinute(sorted[n-1])
        var curr = getMinute(sorted[0])
        var result = minOf(prev - curr, curr + 24 * 60 - prev)
        prev = curr
        for(i in 1 until n) {
            curr = getMinute(sorted[i])
            result = minOf(result, curr-prev)
            prev = curr
        }
        
        return result
    }
    
    fun getMinute(time: String): Int {
        return (time[0] - '0') * 10 * 60 + (time[1] - '0') * 60 + (time[3] - '0') * 10 + (time[4] -'0')
    }
}