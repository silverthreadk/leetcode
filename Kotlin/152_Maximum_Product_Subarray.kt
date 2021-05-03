class Solution {
    fun maxProduct(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        
        var result = nums[0]
        var negative = nums[0]
        var positive = nums[0]
        
        for(i in 1 until nums.size){
            val temp = negative
            
            negative = minOf(positive * nums[i], minOf(negative * nums[i], nums[i]))
            positive = maxOf(positive * nums[i], maxOf(temp * nums[i], nums[i]))

            result = maxOf(result, positive)
        }
        
        return result
    }
}