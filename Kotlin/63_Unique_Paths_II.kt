class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        if(obstacleGrid[0][0] == 1) return 0
        
        val m = obstacleGrid.size
        val n = obstacleGrid[0].size
        val dp = Array(m){IntArray(n){0}}
        
        dp[0][0] = 1
        
        for(i in 1 until m) {
            if(obstacleGrid[i][0] == 1) continue
            dp[i][0] = dp[i-1][0]
        }
        
        for(i in 1 until n) {
            if(obstacleGrid[0][i] == 1) continue
            dp[0][i] = dp[0][i-1]
        }
        
        for(i in 1 until m) {
            for(j in 1 until n) {
                if(obstacleGrid[i][j] == 1) continue
                dp[i][j] = dp[i-1][j] + dp[i][j-1]
            }
        }
        
        return dp[m-1][n-1]
    }
}