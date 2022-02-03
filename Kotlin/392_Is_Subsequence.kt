class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        for(ch in t){
            if (i == s.length) break
            if (ch == s[i]) ++i
        }
        
        return i == s.length
    }
}