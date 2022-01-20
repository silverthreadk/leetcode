class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0
        for(i in 0 until k){
            sum += nums[i]
        }
        
        var maxSum = sum
        
        for(i in k until nums.size){
            sum += nums[i]
            sum -= nums[i - k]
            maxSum = maxOf(sum, maxSum)
        }
        
        return maxSum / k.toDouble()
    }
}