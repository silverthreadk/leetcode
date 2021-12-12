class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var result = 0
        var count = 0
        var start = 0
        
        for(i in nums.indices){
            if(nums[i] == 1) ++count
            
            if(i - start + 1 > count + k){
                if(nums[start] == 1) --count
                ++start
            }
            result = maxOf(result, i - start + 1)
        }
        
        return result
    }
}