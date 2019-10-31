class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size() != t.size()) return false;
        
        map<char, int> count;
        int n = s.size();
        for(int i=0; i<n; ++i){
            ++count[s[i]];
            --count[t[i]];
        }
        
        for(auto& c : count){
            if(c.second != 0) return false;
        }
        
        return true;
    }
};