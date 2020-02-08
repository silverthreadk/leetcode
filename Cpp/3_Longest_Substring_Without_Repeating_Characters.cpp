class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        map<char, int> start;
        int result = 0;
        int j = 0;
        for(int i=0; i<s.length(); ++i){
            auto find_char = start.find(s.at(i));
            if (find_char != start.end()){
                j = std::max(j, find_char->second + 1);

            }
            start[s.at(i)] = i;
            result = std::max(result, i - j + 1);
        }
        
        return result;
    }
};