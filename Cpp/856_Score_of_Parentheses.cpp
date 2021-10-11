class Solution {
public:
    int scoreOfParentheses(string s) {
        int result = 0;
        int open = 0;
        
        for(int i = 0; i < s.size(); ++i) {
            if(s[i] == '(') {
                ++open;
            } else {
                --open;
                if(s[i - 1] == '(') {
                    result += pow(2, open);
                }
            }
        }
        
        return result;
    }
};