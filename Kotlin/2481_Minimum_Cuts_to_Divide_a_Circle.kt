class Solution {
    fun numberOfCuts(n: Int): Int {
        if(n == 1) return 0
        if(n % 2 == 0) return n / 2
        
        return n
    }
}