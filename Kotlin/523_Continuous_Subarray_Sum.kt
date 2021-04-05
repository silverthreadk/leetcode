class Solution {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val remainder = hashMapOf<Int, Int>()
        remainder[0] = -1
        var sum = 0

        for(i in 0 until nums.size){
            sum += nums[i]
            if(k != 0) sum = sum % k
            if(remainder.contains(sum)){
                if(i - remainder.getOrDefault(sum, 0) > 1) return true
            }else{
                remainder[sum] = i
            }
        }

        return false
    }
}