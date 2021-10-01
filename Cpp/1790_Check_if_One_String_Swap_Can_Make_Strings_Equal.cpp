class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        if (s1 == s2) return true;
        
        vector<int> frequency1(26, 0);
        vector<int> frequency2(26, 0);
        int diff = 0;
        
        for(int i = 0; i < s1.size(); i++) {
            if (s1[i] != s2[i]) ++diff;
            ++frequency1[s1[i] - 'a'];
            ++frequency2[s2[i] - 'a'];
        }
        
        if(diff != 2) return false;
        
        for(int i = 0; i < 26; ++i) {
            if(frequency1[i] != frequency2[i]) return false;
        }
        
        return true;
    }
};