class Solution {
    fun findLength(nums1: IntArray, nums2: IntArray): Int {
        var result = 0
        val dp = Array(nums1.size + 1) { IntArray(nums2.size + 1) }

        for(i in nums1.indices) {
            for(j in nums2.indices) {
                if(nums1[i] == nums2[j]){
                    dp[i + 1][j + 1] = dp[i][j] + 1
                    result = maxOf(result, dp[i + 1][j + 1])
                }
            }
        }
        
        return result
    }
}