class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        if(n < 1) return false
        if(n == 1) return true
        
        var i = n
        while(i > 1) {
            if(i % 3 != 0) return false
            i /= 3           
        }
        
        return true
    }
}