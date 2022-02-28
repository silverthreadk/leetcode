class Solution {
    fun maxArea(height: IntArray): Int {
        var result = 0
        var left = 0
        var right = height.lastIndex
        
        while(left < right){
            result = maxOf(result, minOf(height[left], height[right]) * (right - left))
            if(height[left]>height[right]) --right
            else ++left
        }
        
        return result
    }
}