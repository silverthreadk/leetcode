class Solution {
    fun missingNumber(nums: IntArray): Int {
        val sum =  nums.reduce { acc, num -> acc + num }
        val n = nums.size
        
        return n * (n + 1) / 2 - sum
    }
}