class Solution {
    fun arrayNesting(nums: IntArray): Int {
        var result = 0
        val visit = BooleanArray(nums.size)
        
        for(i in nums.indices){
            var count = 0
            var j = i
            while(!visit[j]){
                visit[j] = true
                ++count
                j = nums[j]
            }
            result = maxOf(result, count)
        }
        
        return result
    }
}