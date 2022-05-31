class Solution {
    fun findNumbers(nums: IntArray): Int {
        var result = 0
        nums.forEach{ num ->
            if((num.toString().length and 1) == 0) ++result
        }
        
        return result
    }
}