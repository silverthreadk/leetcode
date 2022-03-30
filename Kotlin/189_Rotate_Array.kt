class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val k = k % n
        reverse(nums, 0, n - 1)
        reverse(nums, 0, k - 1)
        reverse(nums, k, n - 1)
    }
    
    fun reverse(nums: IntArray, start: Int, end: Int) {
        var i = start
        var j = end

        while (i < j) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            ++i
            --j
        }
    }
}