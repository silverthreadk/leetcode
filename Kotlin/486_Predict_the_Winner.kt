class Solution {
    fun PredictTheWinner(nums: IntArray): Boolean {
        return recursive(nums, 0, nums.lastIndex) >= 0
    }
    
    fun recursive(nums: IntArray, begin: Int, end: Int ): Int{
        if(begin==end) return nums[begin]
        return maxOf(nums[begin] - recursive(nums, begin+1, end), nums[end] - recursive(nums, begin, end-1))
    }
}