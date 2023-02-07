class Solution {
public:
    int longestValidParentheses(string s) {
        int result = 0;
        stack<int> st;

        for(int i = 0; i < s.size(); ++i) {
            if(s[i] == '(') {
                st.push(i);
            } else if(!st.empty() && s[st.top()] == '(') {
                st.pop();
                result = max(result, st.empty() ? i + 1 : i - st.top());
            } else {
                st.push(i);
            }
        }

        return result;
    }
};