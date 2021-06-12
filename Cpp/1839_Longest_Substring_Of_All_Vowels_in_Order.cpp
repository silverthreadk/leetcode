class Solution {
public:
    int longestBeautifulSubstring(string word) {
        int result = 0;
        string vowels = "aeiou";
        int length = 0;
        int j = 0;
        for(int i = 0; i<word.size(); ++i) {
            if(word[i] == vowels[j]) {
                ++length;
            } else if(j < vowels.size() - 1 && i > 0 && word[i - 1] == vowels[j] && word[i] == vowels[j + 1]) {
                ++length;
                ++j;
            } else if(word[i] == 'a') {
                length = 1;
                j = 0;
            } else {
                length = 0;
                j = 0;
            }
            
            if(word[i] == 'u' && vowels[j] == 'u') {
                result = max(result, length);
            }
        }
        
        return result;
    }
};