class Solution {
public:
    bool isPalindrome(string s) {
        int i=0;
        int j=s.size()-1;
        while(i<j){
            while(!isAlphanumericChar(s[i]) && i<j) ++i;
            while(!isAlphanumericChar(s[j]) && i<j) --j;
            
            if(tolower(s[i]) != tolower(s[j])){
                return false;
            }
            ++i;
            --j;
        }
        
        return true;
    }
    
    bool isAlphanumericChar(char ch){
        return (ch >= 'a' && ch <= 'z')
            || (ch >= 'A' && ch <= 'Z')
            || (ch >= '0' && ch <= '9');
    }
};