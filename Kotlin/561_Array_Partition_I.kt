class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        var result = 0
        nums.sort()
        for(i in 0 until nums.size step 2){
            result += minOf(nums[i], nums[i+1])
        }
        
        return result
    }
}