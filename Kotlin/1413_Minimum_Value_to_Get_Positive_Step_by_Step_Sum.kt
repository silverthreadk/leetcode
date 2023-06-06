class Solution {
    fun minStartValue(nums: IntArray): Int {
        var sum = 0
        var minimum = 0

        for(num in nums) {
            sum += num
            minimum = minOf(minimum, sum)
        }
        
        return -minimum + 1
    }
}