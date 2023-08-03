class Solution {
    fun totalHammingDistance(nums: IntArray): Int {
        var result = 0
        
        for (i in 0 until 32) {
            var ones = nums.count{ it.and(1.shl(i)) > 0 }
            result += ones * (nums.size - ones)
        }

        return result
    }
}