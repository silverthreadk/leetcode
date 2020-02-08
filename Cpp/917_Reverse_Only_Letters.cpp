class Solution {
public:
    string reverseOnlyLetters(string S) {
        for(int i=0, j=S.length()-1; j>i;){
            if(!isLetter(S[i])) {
                ++i;
                continue;
            }
            if(!isLetter(S[j])) {
                --j;
                continue;
            }
            swap(S[i], S[j]);
            ++i, --j;
        }
        return S;
    }
    
    bool isLetter(const char ch){
        return (ch >='a' && ch<='z') || (ch >='A' && ch <='Z'); 
    }
};