class Solution {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val dp = IntArray(days.last() + 1)
        val s = days.toSet()
        
        dp[0] = 0
        
        for(i in 1 until dp.size) {
            if(s.contains(i)) {
                dp[i] = minOf(costs[0] + dp[i - 1], costs[1] + dp[maxOf(0, i - 7)], costs[2] + dp[maxOf(0, i - 30)])
            } else {
                dp[i] = dp[i - 1]
            }
        }
        
        return dp.last()
    }
}