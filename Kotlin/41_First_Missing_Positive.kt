class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        val s = nums.filter { it > 0 }.toSet()
        
        for(i in 1..nums.size) {
            if (!s.contains(i)) return i
        }
        
        return nums.size + 1
    }
}