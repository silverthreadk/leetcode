class Solution {
    fun trailingZeroes(n: Int): Int {
        var result = 0
        var i = n
        
        while(i != 0){
            i /= 5
            result += i
        }
        
        return result
    }
}