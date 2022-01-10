class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(nums.size) { 1 }
        
        var pre = 1
        var post = 1
        for (i in nums.indices) {
            result[i] *= pre
            pre *= nums[i]
            
            result[n - i - 1] *= post
            post *= nums[n - i - 1]
        }
        
        return result
    }
}