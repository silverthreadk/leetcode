class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        val sorted = nums.sortedArrayDescending()
        
        for(i in 0 until nums.size - 2){
            if(sorted[i] < sorted[i+1] + sorted[i+2]){
                return sorted[i] + sorted[i+1] + sorted[i+2]
            }
        }
        
        return 0
    }
}