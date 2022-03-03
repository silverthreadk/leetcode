class Solution {
    fun rob(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        if(nums.size == 1) return nums[0]
        
        val dp = IntArray(nums.size)
        
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])

        for (i in 2 until nums.size) {
            val cur = nums[i]
            dp[i] = maxOf(dp[i-1], dp[i-2] + nums[i])
        }

        return dp.last()
    }
}