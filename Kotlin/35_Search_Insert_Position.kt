class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi = nums.lastIndex
        
        while(lo <= hi){
            val mid = (lo + hi) / 2
            if(nums[mid] == target) return mid
            else if (nums[mid] < target) lo = mid + 1
            else hi = mid - 1
        }
        
        return lo
    }
}