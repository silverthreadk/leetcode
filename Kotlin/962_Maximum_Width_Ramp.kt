class Solution {
    fun maxWidthRamp(nums: IntArray): Int {
        var result = 0
        val n = nums.size
        val left = IntArray(n) { nums[0] }
        val right = IntArray(n) {nums[n - 1] }
        
        for(i in 1 until n) {
            left[i] = minOf(left[i - 1], nums[i])
        }
        
        for(i in n - 2 downTo 0) {
            right[i] = maxOf(right[i + 1], nums[i])
        }
        
        var i = 0
        var j = 0
        while(j < n) {
            if(left[i] <= right[j]) {
                result = maxOf(result, j-i)
                ++j
            } else {
                ++i
            }
        }
        
        return result
    }
}