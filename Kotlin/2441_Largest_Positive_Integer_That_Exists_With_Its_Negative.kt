class Solution {
    fun findMaxK(nums: IntArray): Int {
        var result = -1

        for(num in nums) {
            if(num > 0 && nums.contains(-num)){
                result = maxOf(result, num)
            }
        }

        return result
    }
}