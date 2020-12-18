class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        vector<string> result;
        unordered_set<char> row1 {'q','w','e','r','t','y','u','i','o','p'};
        unordered_set<char> row2 {'a','s','d','f','g','h','j','k','l'};
        unordered_set<char> row3 {'z','x','c','v','b','n','m'};
        
        for(const auto& word : words){
            if(hasRow(row1, word)){
                result.push_back(word);
            } else if(hasRow(row2, word)){
                result.push_back(word);
            } else if(hasRow(row3, word)){
                result.push_back(word);
            }
        }
        
        return result;
    }
    
    bool hasRow(const unordered_set<char>& row, const string& word){
        for(auto& ch : word){
            if(!row.count(tolower(ch))) return false;
        }
        return true;
    }
};