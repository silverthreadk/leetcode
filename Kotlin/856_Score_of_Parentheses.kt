import kotlin.math.*

class Solution {
    fun scoreOfParentheses(s: String): Int {
        var result = 0.0
        var open = 0
        
        for(i in s.indices) {
            if(s[i] == '(') {
                ++open
            } else {
                --open
                if(s[i - 1] == '(') {
                    result += 2.0.pow(open)
                }
            }
        }
        
        return result.toInt()
    }
}