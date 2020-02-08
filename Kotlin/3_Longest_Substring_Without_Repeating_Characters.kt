class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        var start = hashMapOf<Char, Int>()
        var j = 0
        for(i in s.indices) {
            if(start.containsKey(s[i])){
                j = Math.max(j, start[s[i]]!! + 1)
            }
            start[s[i]] = i
            result = Math.max(result, i - j + 1)
        }
        return result
    }
}