class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for(auto& ch : s) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                continue;
            }
            
            if(st.empty()){
                return false;
            } else if(st.top() == '(' && ch != ')'){
                return false;
            } else if(st.top() == '{' && ch != '}'){
                return false;
            } else if(st.top() == '[' && ch != ']'){
                return false;
            }
            
            st.pop();
        }
        
        return st.empty();
    }
};