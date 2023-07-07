class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var result = Integer.MAX_VALUE
        var sum = 0
        var index = 0
        for(i in nums.indices) {
            sum += nums[i]
            while(target <= sum) {
                result = minOf(result, i - index + 1)
                sum -= nums[index]
                ++index
            }
        }
        
        return if(result == Integer.MAX_VALUE) 0 else result
    }
}