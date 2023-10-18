class Solution {
    fun countGoodSubstrings(s: String): Int {
        var result = 0;
        val n = s.length - 2
        
        for(i in 0 until n) {
            if(s[i] != s[i + 1] && s[i] != s[i + 2] && s[i + 1] != s[i + 2]) ++result
        }
        
        return result
    }
}