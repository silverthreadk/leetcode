class Solution {
    fun minOperations(s: String): Int {
        var result = 0
        val n = s.length
        
        for(i in s.indices) {
            if(s[i] - '0' != i % 2) ++result
        }

        return minOf(result, n - result)
    }
}