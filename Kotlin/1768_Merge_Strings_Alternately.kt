class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var result = ""
        var n = minOf(word1.length, word2.length)
        var i = 0
        var j = 0

        while(i < n) {
            result += word1[i]
            result += word2[j]
            ++i
            ++j
        }
        
        while(i < word1.length) {
            result += word1[i]
            ++i
        }
        
        while(j < word2.length) {
            result += word2[j]
            ++j
        }
        
        return result
    }
}