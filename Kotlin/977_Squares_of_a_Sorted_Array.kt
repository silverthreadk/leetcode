class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var left = 0
        var right = nums.size - 1
        
        for(i in nums.size - 1 downTo 0){
            if(abs(nums[left]) < abs(nums[right])) {
                result[i] = nums[right] * nums[right--]
            } else {
                result[i] = nums[left] * nums[left++]
            }
        }
        
        return result
    }
}