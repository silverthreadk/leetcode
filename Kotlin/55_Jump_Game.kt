class Solution {
    fun canJump(nums: IntArray): Boolean {
        var maxIndex = 0;
        for(i in 0 until nums.size){
            if(maxIndex < i) break
            maxIndex = maxOf(maxIndex, i + nums[i])
        }
        
        return maxIndex >= nums.size - 1
    }
}