class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        nums.forEach {
            result = result.xor(it)
        }
        
        return result
    }
}