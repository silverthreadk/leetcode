class Solution {
    fun longestValidParentheses(s: String): Int {
        var result = 0
        val st = Stack<Int>()

        for(i in s.indices) {
            if(s[i] == '(') {
                st.push(i)
            } else if(!st.isEmpty() && s[st.peek()] == '(') {
                st.pop()
                val current = if(st.isEmpty()) i + 1 else i - st.peek()
                result = maxOf(result, current)
            } else {
                st.push(i)
            }
        }

        return result
    }
}