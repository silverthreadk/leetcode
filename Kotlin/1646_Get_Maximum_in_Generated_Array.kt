class Solution {
    fun getMaximumGenerated(n: Int): Int {
        if(n == 0 || n == 1) return n
        
        var result = 0
        val dp = IntArray(n + 1)
        dp[1] = 1

        for(i in 2..n){
            if(i % 2 == 0){
                dp[i] = dp[i / 2]
            }else{
                dp[i] = dp[(i - 1) / 2] + dp[(i - 1) / 2 + 1]
            }
            result = maxOf(result, dp[i])
        }
        
        return result
    }
}