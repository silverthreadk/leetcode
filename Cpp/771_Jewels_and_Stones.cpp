class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int result = 0;
        unordered_map<char, int> frequency;
        for(auto& ch : S){
            ++frequency[ch];
        }
        for(auto& ch : J){
            result += frequency[ch];
        }
        
        return result;
    }
};