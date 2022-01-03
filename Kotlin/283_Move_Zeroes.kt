class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var index = 0
        for(i in nums.indices) {
            if(nums[index] != 0){
                ++index
            } else if(nums[i] != 0) {
                nums[index++] = nums[i]
                nums[i] = 0
            }
        }
    }
}