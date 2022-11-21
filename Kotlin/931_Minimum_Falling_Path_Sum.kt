class Solution {
    fun minFallingPathSum(matrix: Array<IntArray>): Int {
        var result = Integer.MAX_VALUE
        val m = matrix.size
        val n = matrix[0].size
        val dp = Array(m){ IntArray(n) {0} }
        
        for(i in 0 until n) {
            dp[0][i] = matrix[0][i]
        }
        
        for(i in 1 until m) {
            for(j in 0 until n) {
                var path = dp[i - 1][j]
                if(j > 0) {
                    path = minOf(path, dp[i - 1][j - 1])
                }
                
                if(j < n - 1) {
                    path = minOf(path, dp[i - 1][j + 1])
                }
                
                dp[i][j] = matrix[i][j] + path
            }
        }
        
        for(i in 0 until n) {
            result = minOf(result, dp[m - 1][i])
        }
        
        return result
    }
}