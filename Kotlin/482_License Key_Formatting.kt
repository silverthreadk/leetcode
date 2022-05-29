class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {
        val result = StringBuilder()
        
        for (i in s.lastIndex downTo 0) {
            if(s[i] == '-') continue
            if(result.length % (k + 1) == k) {
                result.append('-')
            }
            
            result.append(s[i].toUpperCase())
        }
        
        return result.reversed().toString()
    }
}