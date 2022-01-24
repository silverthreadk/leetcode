class Solution {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        if (matrix.isEmpty()) return 0
        val m = matrix.size
        val n = matrix[0].size
        
        val dp = Array(m + 1) { IntArray(n + 1) {0} }

        var max_length = 0
        for(i in 1..m) {
            for(j in 1..n) {
                if (matrix[i - 1][j - 1] == '0') continue
                
                dp[i][j] = minOf(minOf(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1

                max_length = maxOf(max_length, dp[i][j] * dp[i][j])
            }
        }

        return max_length
    }
}