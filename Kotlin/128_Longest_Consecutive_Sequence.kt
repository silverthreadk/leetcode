class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        
        var result = 1
        var count = 1
        
        nums.sort()
        
        for(i in 0 .. nums.lastIndex-1){
            if(nums[i+1] - nums[i] == 1) {
                ++count
            }else if(nums[i+1] - nums[i] != 0) {
                result = Math.max(result, count)
                count = 1
            }
        }
        
        result = Math.max(result, count)
        
        return result
    }
}