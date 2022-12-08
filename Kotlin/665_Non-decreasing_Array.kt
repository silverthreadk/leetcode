665. Non-decreasing Array
class Solution {
    fun checkPossibility(nums: IntArray): Boolean {
        var modified = false
        var prev = nums[0]
        
        for(i in 1 until nums.size) {
            if(nums[i] < prev) {
                if(modified) return false
                
                modified = true
                if(i > 1 && nums[i - 2] > nums[i]) continue
            }
            
            prev = nums[i]
        }
        
        return true
    }
}