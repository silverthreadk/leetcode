class Solution {
    fun isValid(s: String): Boolean {
        val st = Stack<Char>()
        s.forEach {
            if(it == '(' || it == '{' || it == '[') {
                st.push(it)
                return@forEach
            }
            
            if(st.isEmpty()){
                return false
            } else if(st.peek() == '(' && it != ')'){
                return false
            } else if(st.peek() == '{' && it != '}'){
                return false
            } else if(st.peek() == '[' && it != ']'){
                return false
            }
            
            st.pop()
        }

        return st.isEmpty()
    }
}