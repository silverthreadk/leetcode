class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m + 1) { IntArray(n + 1) { 0 } }
        
        for(i in 0 until m){
            dp[i][0] = 1
        }
        
        for(i in 0 until n){
            dp[0][i] = 1
        }
        
        for(i in 1 until m){
            for(j in 1 until n){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
            }
        }
        
        return dp[m - 1][n - 1]
    }
}