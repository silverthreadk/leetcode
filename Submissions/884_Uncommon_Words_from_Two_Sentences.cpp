class Solution {
public:
    vector<string> uncommonFromSentences(string A, string B) {
        vector<string> result;
        map<string, int> word_map;

        split(A, word_map);
        split(B, word_map);
        
        for(auto word : word_map) {
            if (word.second == 1) result.push_back(word.first);
        }
        
        return result;
    }
    
    void split(const string& str, map<string, int>& word_map) {
        std::size_t prev_pos = str.find_first_not_of(' ', 0);
        std::size_t pos = str.find_first_of(' ', prev_pos);
        
        while (pos != string::npos || prev_pos != string::npos) {
            word_map[(str.substr(prev_pos, pos - prev_pos))] += 1;
            prev_pos = str.find_first_not_of(' ', pos);
            pos = str.find_first_of(' ', prev_pos);
        }
    }
};