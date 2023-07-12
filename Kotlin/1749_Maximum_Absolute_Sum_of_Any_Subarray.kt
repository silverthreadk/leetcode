class Solution {
    fun maxAbsoluteSum(nums: IntArray): Int {
        var maxSum = 0
        var minSum = Integer.MAX_VALUE
        var positive = 0
        var negative = 0
        
        for(num in nums) {
            positive = maxOf(positive + num, 0)
            maxSum = maxOf(maxSum, positive)
            
            negative = minOf(negative + num, 0)
            minSum = minOf(minSum, negative)
        }
        
        return maxOf(maxSum, -minSum)
    }
}