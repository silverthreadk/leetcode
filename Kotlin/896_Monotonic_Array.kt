class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        if (nums.size < 3) return true
        
        val ascending = nums[0] < nums[nums.lastIndex]
        for(i in 1..nums.lastIndex) {
            if((ascending && nums[i] < nums[i - 1])
               || (!ascending && nums[i] > nums[i - 1])) return false
        }
        
        return true
    }
}