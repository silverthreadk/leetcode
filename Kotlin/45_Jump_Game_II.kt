class Solution {
    fun jump(nums: IntArray): Int {
        val n = nums.size
        val dp = IntArray(n) { Int.MAX_VALUE }
        dp[0] = 0

        for(i in 0 until n){
            val maxJump = minOf(n, i + 1 + nums[i])
            for(j in i + 1 until maxJump){
                dp[j] = minOf(dp[j], dp[i] + 1)
            }
        }
        
        return dp[n - 1]
    }
}