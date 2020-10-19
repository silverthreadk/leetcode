class Solution {
public:
    vector<string> findAndReplacePattern(vector<string>& words, string pattern) {
        vector<string> result;
        for(auto& word : words){
            if(match(word, pattern)) {
                result.push_back(word);
            }
        }
        
        return result;
    }
    
    bool match(string word, string pattern){
        unordered_map<char, char> m;
        unordered_set<char> s;
        for(int i=0; i<word.size(); ++i){
            if(m.count(word[i]) == 0){
                m[word[i]] = pattern[i];
                if(s.count(pattern[i])!=0) return false;
                s.insert(pattern[i]);
            } else if(m[word[i]] != pattern[i]){
                return false;
            }
        }
        
        return true;
    }
};