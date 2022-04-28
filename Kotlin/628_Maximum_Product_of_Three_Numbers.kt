class Solution {
    fun maximumProduct(nums: IntArray): Int {
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var max3 = Int.MIN_VALUE
        
        nums.forEach{ num ->
            if(num >= max1){
                max3 = max2
                max2 = max1
                max1 = num
            } else if(num >= max2){
                max3 = max2
                max2 = num
            } else if(num >= max3){
                max3 = num
            }
            
            if(num <= min1){
                min2 = min1
                min1 = num
            } else if(num <= min2){
                min2 = num
            }
        }
        
        return maxOf(min1 * min2 * max1, max1 * max2 * max3)
    }
}