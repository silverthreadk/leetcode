class Solution {
    fun heightChecker(heights: IntArray): Int {
        var expected = heights.sorted()
        var result = 0 
        
        for(i in heights.indices) {
             if(heights[i] != expected[i]) ++result
        }
        
        return result
    }
}