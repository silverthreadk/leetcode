class Solution {
    fun findShortestSubArray(nums: IntArray): Int {
        var frequency = hashMapOf<Int, Int>()
        var start = hashMapOf<Int, Int>()
        var max_degree = 1
        var length = nums.lastIndex + 1

        for((i, num) in nums.withIndex()) {
            if(!frequency.containsKey(nums[i])){
                start[num] = i
            }
            frequency[num] = (frequency[num]?:0) + 1
            if(frequency[num]?:0 > max_degree) {
                max_degree = frequency[num]?:0
                length = i - (start[num]?:0) + 1
            }else if (frequency[num] == max_degree) {
                length = Math.min(length, i - (start[num]?:0) + 1)
            }
        }
        
        return length
    }
}