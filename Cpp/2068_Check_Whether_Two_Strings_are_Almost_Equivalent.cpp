class Solution {
public:
    bool checkAlmostEquivalent(string word1, string word2) {
        vector<int> frequency(26, 0);

        for(auto& ch : word1){
            ++frequency[ch - 'a'];
        }

        for(auto& ch : word2){
            --frequency[ch - 'a'];
        }

        for(int i = 0; i < 26; ++i){
            if(abs(frequency[i]) > 3) return false;
        }

        return true;
    }
};