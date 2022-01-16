class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var lo = 0;
        var hi = nums.size - 1
        
        while(lo <= hi){
            val mid = (hi + lo) / 2
            if(nums[mid] == target) return mid
            if(nums[mid] < nums[hi]){
                if(nums[mid] < target && target <= nums[hi]) lo = mid + 1
                else hi = mid - 1
            }else {
                if(nums[mid] > target && target >= nums[lo]) hi = mid - 1
                else lo = mid + 1
            }
        }
        
        return -1
    }
}