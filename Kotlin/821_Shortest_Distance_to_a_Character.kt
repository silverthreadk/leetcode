class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val n = s.length
        val result = IntArray(n){n}
        var prev = -n
        
        for(i in s.indices) {
            if(s[i] == c) prev = i
            result[i] = i - prev
        }
        
        prev = 2 * n
        for(i in s.indices.reversed()) {
            if(s[i] == c) prev = i
            result[i] = Math.min(result[i], prev - i)
        }
        
        return result
    }
}