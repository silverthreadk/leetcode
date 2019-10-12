class Solution {
public:
    string removeOuterParentheses(string S) {
        string result = "";
        int open = 0;
        
        for(int i=0; i<S.size(); ++i){
            if(S[i]=='(') {
                ++open;
                if(open>1) result += '(';
            } else if(S[i]==')') {
                --open;
                if(open>0) result += ')';
            }
        }
        
        return result;
    }
};