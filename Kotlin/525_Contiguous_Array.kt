class Solution {
    fun findMaxLength(nums: IntArray): Int {
        val start = HashMap<Int, Int>()
        var result = 0
        var sum = 0
    
        start[0] = -1
        for(i in nums.indices) {
            sum += if(nums[i] == 0) - 1 else 1

            if(start.contains(sum)) {
                result = maxOf(result, i - start[sum]!!)
            } else {
                start[sum] = i
            }
        }

        return result
    }
}