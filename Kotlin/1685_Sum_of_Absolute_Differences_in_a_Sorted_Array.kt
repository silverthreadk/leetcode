class Solution {
    fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)
        val prefix = IntArray(n)
        prefix[0] = nums[0]
        
        for(i in 1 until n) {
            prefix[i] = prefix[i - 1] + nums[i]
        }
        
        for (i in 0 until n) {
            val left = if(i > 0) i * nums[i] - prefix[i - 1] else 0
            val right = prefix[n - 1] - prefix[i] - (n - 1 - i) * nums[i]
            
            result[i] = left + right
        }
        
        return result
    }
}