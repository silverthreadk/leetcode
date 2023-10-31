class Solution {
    fun check(nums: IntArray): Boolean {
        val n = nums.size
        var count = 0
        
        for(i in nums.indices) {
            if(nums[i] > nums[(i + 1) % n]) ++count
        }

        return count <= 1
    }
}