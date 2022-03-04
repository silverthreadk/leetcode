class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var result = 0
        columnTitle.forEach{ ch ->
            result = result * 26 + (ch - 'A' + 1)
        }
        
        return result
    }
}