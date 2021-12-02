class Solution {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val n = triangle.size
        if(n == 1) return triangle[0][0]
        
        var dp = MutableList<Int>(triangle.size) { 0 }
        dp[0] = triangle[0][0] + triangle[1][0]
        dp[1] = triangle[0][0] + triangle[1][1]
        
        for(i in 2 until n){
            val m = triangle[i].size
            dp[m - 1] = dp[m - 2] + triangle[i][m - 1]
            for(j in m - 2 downTo 1){
                dp[j] = minOf(dp[j - 1], dp[j]) + triangle[i][j]
            }
            dp[0] = dp[0] + triangle[i][0]
        }
        
        return dp.min()!!
    }
}