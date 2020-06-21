class Solution {
public:
    string reverseVowels(string s) {
        int i=0;
        int j=s.size()-1;
        string result = s;
        while(i<j){
            if(!isVowel(result[i])){
                ++i;
            }
            if(!isVowel(result[j])){
                --j;
            }
            if(isVowel(result[i]) && isVowel(result[j])){
                swap(result[i], result[j]);
                ++i;
                --j;
            }
        }
        
        return result;
    }
    
    bool isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'; 
    }
};