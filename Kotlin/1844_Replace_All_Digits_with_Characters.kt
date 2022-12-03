class Solution {
    fun replaceDigits(s: String): String {
        val result = StringBuilder()
        
        for(i in 0 until s.length) {
            if(i % 2 == 0) {
                result.append(s[i])
            } else {
                result.append(s[i - 1] + s[i].toInt() - '0'.toInt())
            }
        }
        
        return result.toString()
    }
}