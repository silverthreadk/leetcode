class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var majority = 0
        
        nums.forEach{num ->
            if(count == 0) {
                majority = num
            }
            
            if(num == majority) ++count
            else --count
        }
        
        return majority
    }
}