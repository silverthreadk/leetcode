class Solution {
    fun longestIncreasingPath(matrix: Array<IntArray>): Int {
        var result = 0
        val dp = Array(matrix.size){ IntArray(matrix[0].size) {-1} }

        for(row in 0 until matrix.size){
            for(col in 0 until matrix[0].size){
                result = maxOf(result, recursive(matrix, dp, row, col, -1))
            }
        }
        
        return result
    }
    
    fun recursive(matrix : Array<IntArray>, dp : Array<IntArray>, row : Int, col : Int, prev : Int) : Int {
        if(row < 0 || col < 0 || row > matrix.size - 1 || col > matrix[0].size - 1
           || prev >= matrix[row][col]) return 0
        
        if(dp[row][col] != -1) return dp[row][col]
        
        val max = intArrayOf(recursive(matrix, dp, row - 1, col, matrix[row][col]),
                             recursive(matrix, dp, row + 1, col, matrix[row][col]),
                             recursive(matrix, dp, row, col - 1, matrix[row][col]),
                             recursive(matrix, dp, row, col + 1, matrix[row][col])).max() ?: 0
        dp[row][col] = 1 + max
        
        return dp[row][col]
    }
}