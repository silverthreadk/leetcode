class Solution {
public:
    bool validPalindrome(string s) {
        int n = s.size();
        for(int i=0; i<n/2; ++i){
            if(s[i] == s[n-1-i]) continue;
            
            return isValid(s, i+1, n-1-i) || isValid(s, i, n-2-i);
        }
        
        return true;
    }
    
    bool isValid(string s, int start, int end){
        int i = start, j = end;
        while(i<j){
            if(s[i]!=s[j]) return false;
            ++i, --j;
        }
        return true;
    }
};