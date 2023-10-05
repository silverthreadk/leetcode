class Solution {
    fun removeStars(s: String): String {
        val result = StringBuilder()
        
        for(ch in s) {
            if(ch == '*') {
                result.deleteCharAt(result.length - 1)
            }else {
                result.append(ch)
            }
        }

        return result.toString()
    }
}