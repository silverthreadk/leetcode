class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        return processBackspace(s).equals(processBackspace(t))
    }
    
    fun processBackspace(s: String) : String{
        val sb = StringBuilder()
        var i = 0
        for(ch in s.toCharArray()){
            if(ch == '#') {
                if(sb.isNotEmpty()) sb.deleteCharAt(--i)
            } else {
                sb.append(ch)
                ++i
            }
        }
        
        return sb.toString()
    }
}