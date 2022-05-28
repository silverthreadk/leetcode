class Solution {
    fun findMin(nums: IntArray): Int {
        var lo = 0
        var hi = nums.lastIndex
        
        while(lo < hi){
            val mid = lo + (hi - lo) / 2
            if(nums[mid] < nums[hi]) {
                hi = mid
            } else {
                lo = mid + 1
            }
        }
        
        return nums[lo]
    }
}