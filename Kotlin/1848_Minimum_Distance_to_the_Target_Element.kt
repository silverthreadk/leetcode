class Solution {
    fun getMinDistance(nums: IntArray, target: Int, start: Int): Int {
        var result = Int.MAX_VALUE
        
        for(i in 0 until nums.size){
            if(nums[i] != target) continue
            result = minOf(result, Math.abs(i - start))
        }
        
        return result
    }
}