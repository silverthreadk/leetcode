class Solution {
    fun isThree(n: Int): Boolean {
        var divisor = 0
        
        for(i in 1..n){
            if(n%i == 0) ++divisor
            if(divisor > 3) return false
        }
        
        return divisor == 3
    }
}