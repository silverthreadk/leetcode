class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        vector<int> frequency(26, 0);
        for(auto& ch : magazine){
            ++frequency[ch - 'a'];
        }
        
        for(auto& ch : ransomNote){
            if(frequency[ch - 'a'] == 0) return false;
            --frequency[ch - 'a'];
        }
        
        return true;
    }
};