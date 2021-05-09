class Solution {
    fun removeOuterParentheses(S: String): String {
        val result = StringBuilder()
        var open = 0
        
        for(c in S){
            if(c == '('){
                ++open
                if(open <= 1) continue
            }else{
                --open
                if(open <= 0) continue
            }
            result.append(c)
        }
        
        return result.toString()
    }
}