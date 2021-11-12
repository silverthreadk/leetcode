class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        
        var result = 1
        var length = 1
        
        for(i in 1 until nums.size) {
            if(nums[i] - nums[i-1] > 0) {
                ++length
            } else {
                result = Math.max(result, length)
                length = 1
            }
        }
        
        return Math.max(result, length)
    }
}