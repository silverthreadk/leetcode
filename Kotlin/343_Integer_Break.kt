class Solution {
    fun integerBreak(n: Int): Int {
        if (n == 2 || n == 3) return n - 1
        
        val dp = IntArray(n + 1)
        dp[0] = 1
        dp[1] = 1
        for(i in 2..n){
            for(j in 2..i){
                dp[i] = maxOf(dp[i], dp[i-j] * j)
            }
        }
        
        return dp[n]
    }
}