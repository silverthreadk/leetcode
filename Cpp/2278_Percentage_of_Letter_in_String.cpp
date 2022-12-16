class Solution {
public:
    int percentageLetter(string s, char letter) {
        vector<int> frequency(26, 0);
        
        for(auto& ch : s) {
            ++frequency[ch - 'a'];
        }

        return 100 * frequency[letter - 'a'] / s.length();
    }
};