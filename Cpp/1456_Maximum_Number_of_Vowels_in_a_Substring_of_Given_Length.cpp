class Solution {
public:
    int maxVowels(string s, int k) {
        int result = 0;
        int count = 0;

        for(int i = 0; i < k; ++i) {
            if(isVowel(s[i])) ++count;
        }

        for(int i = 0, j = k; j != s.size(); i++, j++){
            if(isVowel(s[i])) --count;
            if(isVowel(s[j])) ++count;
            result = max(result, count);
        }

        return result;
    }

    int isVowel(char ch){
         return (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u');
    }
};