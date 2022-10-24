class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
        var sum = nums[0]
        var result = sum
        
        for(i in 1 until nums.size) {
            if(nums[i] <= nums[i - 1]) {
                sum = 0
            }
            sum += nums[i]
            result = maxOf(result, sum)
        }
        
        return result
    }
}