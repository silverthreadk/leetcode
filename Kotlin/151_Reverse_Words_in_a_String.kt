class Solution {
    fun reverseWords(s: String): String {
        val result = StringBuilder()
        val st = Stack<String>()
        val word = StringBuilder()
        
        for(ch in s){
            if(ch.isWhitespace()){
                if(word.isNotBlank()){
                    st.push(word.toString())
                }
                word.clear()
            }else{
                word.append(ch)
            }
        }
        st.push(word.toString())
        
        while(st.isNotEmpty()){
            result.append(st.pop())
            result.append(" ")
        }
        
        return result.trim().toString()
    }
}