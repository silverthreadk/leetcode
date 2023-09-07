class Solution {
    fun minSteps(n: Int): Int {
        val dp = IntArray(n + 1) { it }
        dp[1] = 0
        
        for(i in 2..n) {
            var j = 2
            while(i * j <= n) {
                dp[i * j] = minOf(dp[i * j], dp[i] + j)
                ++j
            }
        }

        return dp[n]
    }
}