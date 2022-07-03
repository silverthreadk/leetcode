class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        var result = CharArray(s.length)
        
        for(i in indices.indices){
            result[indices[i]] = s[i]
        }
        
        return String(result)
    }
}