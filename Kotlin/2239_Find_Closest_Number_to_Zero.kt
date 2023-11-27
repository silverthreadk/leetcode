class Solution {
    fun findClosestNumber(nums: IntArray): Int {
        var result = Int.MAX_VALUE

        for(num in nums){
            if(abs(num) < abs(result)){
                result = num
            } else if(abs(num) == abs(result)){
                result = maxOf(result, num)
            }
        }

        return result
    }
}