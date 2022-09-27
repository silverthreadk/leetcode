class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val first = searchFirstPosition(nums, target)
        val last = searchLastPosition(nums, target)
        
        if(first == nums.size || nums[first] != target) {
            return intArrayOf(-1, -1)
        }
        
        return intArrayOf(first, last)
    }

    fun searchFirstPosition(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi = nums.size

        while(lo < hi) {
            val mid = (lo + hi) / 2
            if(nums[mid] < target) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }
        
        return lo
    }
    
    fun searchLastPosition(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi = nums.size

        while (lo < hi) {
            val mid = (lo + hi) / 2
            if(nums[mid] <= target) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }
        
        return lo - 1
    }
}