class Solution {
public:
    bool areOccurrencesEqual(string s) {
        vector<int> frequency(26, 0);
        
        for(int i = 0; i < s.length(); ++i) {
            ++frequency[s[i] - 'a'];
        }

        int current = frequency[s[0] - 'a'];
        
        for(auto& it : frequency){
            if(it > 0 && it != current) return false;
        }

        return true;
    }
};