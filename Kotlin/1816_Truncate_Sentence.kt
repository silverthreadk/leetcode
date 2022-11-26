class Solution {
    fun truncateSentence(s: String, k: Int): String {
        val result = StringBuilder()
        var i = 0
        
        for(ch in s){
            if(ch == ' ') ++i
            if(k == i) return result.toString()
            result.append(ch)
        }
        
        return result.toString()
    }
}