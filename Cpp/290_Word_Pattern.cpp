class Solution {
public:
    bool wordPattern(string pattern, string str) {
        unordered_map<char, string> pattern_map;
        unordered_map<string, char> word_map;
        string word;
        int pattern_index = 0;
        for(auto& ch : str) {
            if(ch == ' '){
                auto pattern_found = pattern_map.find(pattern[pattern_index]);
                if(pattern_found != pattern_map.end() && pattern_found->second != word) {
                    return false;
                }
                
                auto word_found = word_map.find(word);
                if(word_found != word_map.end() && word_found->second != pattern[pattern_index]) {
                    return false;
                }
                pattern_map[pattern[pattern_index]] = word;
                word_map[word] = pattern[pattern_index];
                word = "";
                ++pattern_index;
            } else {
                word += ch;
            }
        }
        
        auto pattern_found = pattern_map.find(pattern[pattern_index]);
        auto word_found = word_map.find(word);
        return pattern_index == pattern.size() - 1
            && (pattern_found == pattern_map.end() || pattern_found->second == word) 
            && (word_found == word_map.end() || word_found->second == pattern[pattern_index]);
    }
};