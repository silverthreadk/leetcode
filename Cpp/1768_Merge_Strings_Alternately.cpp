class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string result = "";
        int n = min(word1.size(), word2.size());
        int i = 0;
        int j = 0;
        for(; i < n; ++i, ++j) {
            result += word1[i];
            result += word2[j];
        }
        
        for(; i < word1.size(); ++i) {
            result += word1[i];
        }
        
        for(; j < word2.size(); ++j) {
            result += word2[j];
        }
        
        return result;
    }
};