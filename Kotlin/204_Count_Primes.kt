class Solution {
    fun countPrimes(n: Int): Int {
        val prime = BooleanArray(n + 1) { true }
        
        for(i in 2..n) {
            if(!prime[i]) continue
            
            for(j in 2 * i..n step i) {
                prime[j] = false
            }
            
        }
        
        return prime.filterIndexed { index, _ -> index > 1 && index < n }
                    .count { it }
    }
}