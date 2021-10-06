class Solution {
public:
    bool makeEqual(vector<string>& words) {
        vector<int> frequency(26, 0);
        
        for(auto& word : words) {
            for(auto& ch : word) {
                ++frequency[ch - 'a'];
            }
        }
        
        for(auto& it : frequency) {
            if(it % words.size() != 0) return false;
        }
        
        return true;
    }
};