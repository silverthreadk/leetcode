class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        
        for(i in 1 until strs.size) {
            for(j in prefix.indices) {
                if(j == strs[i].length || prefix[j] != strs[i][j]) {
                    prefix = prefix.substring(0, j)
                    break
                }
            }
        }
        
        return prefix
    }
}