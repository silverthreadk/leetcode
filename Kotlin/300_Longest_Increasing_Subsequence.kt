class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        val dp = mutableListOf(nums[0])
        nums.forEach{ num ->
            if(num > dp.last()) {
                dp.add(num)
            } else {
                val found = dp.binarySearch(num)
                if(found < 0) dp[-found - 1] = num
            }
        }
        
        return dp.size
    }
}