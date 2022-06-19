class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var result = 0
        var consecutiveCount = 0
        
        nums.forEach{ num ->
            if(num == 1){
                ++consecutiveCount
            } else {
                result = maxOf(result, consecutiveCount)
                consecutiveCount = 0
            }
        }
        
        result = maxOf(result, consecutiveCount)
        
        return result
    }
}