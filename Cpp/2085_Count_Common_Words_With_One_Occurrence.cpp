class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {
        int result = 0;
        unordered_map<string, int> frequency;

        for(auto& word : words1) {
            ++frequency[word];
        }

        for(auto& word : words2) {
            if(frequency[word] < 2) --frequency[word];
        }
        
        for(auto& it : frequency) {
            if(it.second == 0) ++result;
        }
        
        return result;
    }
};