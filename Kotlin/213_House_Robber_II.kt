class Solution {
    fun rob(nums: IntArray): Int {
        val n = nums.size
        if(n <= 2) return recursive(nums, 0, n-1)
        return maxOf(recursive(nums, 0, n-2), recursive(nums, 1, n-1))
    }
    
    fun recursive(nums: IntArray, begin: Int, end: Int): Int{
        var prev1 = 0
        var prev2 = 0
        var curr = 0
        
        for(i in begin..end){
            curr = maxOf(prev1 + nums[i], prev2)
            prev1 = prev2
            prev2 = curr
        }
        
        return curr
    }
}