class Solution {
    fun findUnsortedSubarray(nums: IntArray): Int {
        val n = nums.size
        val sort_num = nums.clone()
        sort_num.sort()
        
        var start = nums.size
        var end = -1
        for (i in 0 until nums.size) {
            if (nums[i] != sort_num[i]) {
                start = minOf(start, i)
                end = i
            }
        }

        return maxOf(end - start + 1, 0)
    }
}