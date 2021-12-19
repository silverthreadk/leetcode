class Solution {
    fun diStringMatch(s: String): IntArray {
        val n = s.length
        val result = IntArray(n + 1)
        var lo = 0
        var hi = n
        
        for (i in s.indices) {
            if(s[i] == 'I') {
                result[i] = lo++
            }else {
                result[i] = hi--
            }
            
        }
        result[n] = lo
        
        return result
    }
}