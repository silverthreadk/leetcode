class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        val count = IntArray(101){0}
        
        for(num in nums) {
            count[num] += 1
        }
        
        var sum = 0
        for(i in count.indices) {
            if(count[i] == 0) continue
            
            val temp = count[i]
            count[i] = sum
            sum += temp
        }
        
        for(i in nums.indices) {
            result[i] = count[nums[i]]
        }
        
        return result
    }
}