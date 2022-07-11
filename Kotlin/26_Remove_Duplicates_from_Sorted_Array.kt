class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        
        var length = 1
        
        for(i in 1 until nums.size){
            if(nums[length - 1] != nums[i]){
                nums[length] = nums[i]
                ++length
            }
        }
        
        return length
    }
}