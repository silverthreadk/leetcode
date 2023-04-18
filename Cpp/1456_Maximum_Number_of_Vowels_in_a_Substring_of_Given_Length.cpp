class Solution {
public:
    int maxVowels(string s, int k) {
        int result = 0;
        int count = 0;

        for(int i = 0; i < k; ++i) {
            if(isVowel(s[i])) ++count;
        }
        result = max(result, count);

        for(int i = k; i < s.size(); ++i) {
            if(isVowel(s[i - k])) --count;
            if(isVowel(s[i])) ++count;

            result = max(result, count);
        }

        return result;
    }

    int isVowel(char ch){
         return (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u');
    }
};