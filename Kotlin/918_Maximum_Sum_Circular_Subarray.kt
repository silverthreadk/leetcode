class Solution {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var maxResult = nums[0]
        var minResult = nums[0]
        var maxSum = nums[0]
        var minSum = nums[0]
        var totalSum = nums[0]
        
        for(i in 1 until nums.size){
            maxSum = maxOf(nums[i], maxSum + nums[i])
            maxResult = maxOf(maxResult, maxSum)

            minSum = minOf(nums[i], minSum + nums[i])
            minResult = minOf(minResult, minSum)

            totalSum += nums[i]
        }
        
        if(minResult == totalSum) return maxResult
        
        return maxOf(maxResult, totalSum - minResult)
    }
}