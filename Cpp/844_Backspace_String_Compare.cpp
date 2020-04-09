class Solution {
public:
    bool backspaceCompare(string S, string T) {
        int i = S.size() - 1;
        int j = T.size() - 1;       
        while(i >= 0 || j >= 0){
            int backspace_count = 0;
            while(i>=0 && (S[i]=='#' || backspace_count>0)){
                if(S[i]=='#'){
                    ++backspace_count;
                } else {
                    --backspace_count;
                }
                --i;
            }
            
            backspace_count = 0;
            while(j>=0 && (T[j]=='#' || backspace_count>0)){
                if(T[j]=='#'){
                    ++backspace_count;
                } else {
                    --backspace_count;
                }
                --j;
            }
            
            if(i<0 && j>=0) return false;
            if(j<0 && i>=0) return false;
            if(i>=0 && j>=0 && S[i] != T[j]) return false;
            
            --i;
            --j;
        }
        
        return true;
    }
};