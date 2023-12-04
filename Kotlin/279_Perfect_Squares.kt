class Solution {
    fun numSquares(n: Int): Int {
        val dp = IntArray(n + 1)
        
        for(i in 1..n) {
            var j = 1
            while(j * j <= i) {
                if(dp[i] == 0) {
                    dp[i] = 1 + dp[i - j * j]
                } else {
                    dp[i] = minOf(dp[i], dp[i - j * j] + 1)
                }
                ++j
            }
        }
        
        return dp[n]
    }
}