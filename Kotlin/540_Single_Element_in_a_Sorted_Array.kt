class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
        var lo = 0
        var hi = nums.size - 1
    
        while (lo < hi) {
            var mid = lo + (hi - lo) / 2
            if (mid % 2 == 1) --mid

            if (nums[mid] != nums[mid + 1]) hi = mid
            else lo = mid + 2
        }

        return nums[lo]
    }
}