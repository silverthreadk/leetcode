class Solution {
    fun maxProduct(nums: IntArray): Int {
        var first = Int.MIN_VALUE + 1
        var second = Int.MIN_VALUE
        
        nums.forEach{
            if(it >= first){
                second = first
                first = it
            } else if(it >= second){
                second = it
            }
        }
        
        return (first - 1) * (second - 1)
    }
}