class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val dp = Array<IntArray>(m,{IntArray(n)})
        
        dp[0][0] = grid[0][0]
        for(i in 1 until m) {
            dp[i][0] = dp[i - 1][0] + grid[i][0]
        }
        
        for(i in 1 until n) {
            dp[0][i] = dp[0][i - 1] + grid[0][i]
        }
        
        for(i in 1 until m) {
            for(j in 1 until n) {
                dp[i][j] = minOf(dp[i][j-1], dp[i-1][j]) + grid[i][j]
            }
        }
        
        return dp[m-1][n-1]
    }
}