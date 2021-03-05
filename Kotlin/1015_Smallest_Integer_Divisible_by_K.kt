class Solution {
    fun smallestRepunitDivByK(K: Int): Int {
        if (K % 2 == 0 || K % 5 == 0) return -1
        var result = 1
        var n = 1
        while(n % K != 0){
            n = (n * 10 + 1) % K
            ++result
        }
        
        return result
    }
}