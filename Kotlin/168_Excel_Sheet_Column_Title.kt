class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val result = StringBuilder()
        var current = columnNumber
        
        while (current > 0) {
            --current
            result.append((current % 26 + 'A'.toInt()).toChar())
            current /= 26
        }
        
        return result.toString().reversed()
    }
}