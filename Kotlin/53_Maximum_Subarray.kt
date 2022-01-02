class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var result = nums.first()
        var sum = 0
        nums.forEach{ num ->
            sum += num
            result = maxOf(result, sum)
            sum = maxOf(sum, 0)
        }
        
        return result
    }
}