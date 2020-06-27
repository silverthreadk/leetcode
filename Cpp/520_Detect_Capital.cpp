class Solution {
public:
    bool detectCapitalUse(string word) {
        int upper_count = 0;
        for(auto ch : word){
            upper_count += isupper(ch) ? 1 : 0;
        }
        
        return upper_count == 0 || upper_count == word.size() 
            || (upper_count == 1 && isupper(word[0]));
    }
};