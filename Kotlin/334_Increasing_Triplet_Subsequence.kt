class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
            var i = Integer.MAX_VALUE
            var j = Integer.MAX_VALUE
            
            for(num in nums) {
                if(num > j) return true
                else if(num > i) j = num
                else if(num < i) i = num
            }
            
            return false
    }
}