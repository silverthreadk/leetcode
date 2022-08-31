class Solution {
    fun maxRotateFunction(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        
        val n = nums.size
        var result = 0
        var sum = 0
        var rotation = 0
        
        for(i in 0 until n){
            rotation += nums[i] * i
            sum += nums[i]
        }
        result = rotation
        
        for(i in 0 until n - 1){
            rotation -= sum
            rotation += nums[i] * n
            result = maxOf(result, rotation)
        }
        
        return result
    }
}