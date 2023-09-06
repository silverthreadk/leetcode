class Solution {
    fun numberOfArithmeticSlices(nums: IntArray): Int {
        if(nums.size < 3) return 0
        
        var result = 0
        var count = 0
        var prevDifference = nums[1] - nums[0]
        
        for(i in 1 until nums.size - 1) {
            val difference = nums[i + 1] - nums[i]

            if(difference == prevDifference) {
                ++count
            } else {
                prevDifference = difference
                count = 0
            }
            
            result += count
        }
        
        return result
    }
}