class Solution {
public:
    int countCharacters(vector<string>& words, string chars) {
        int result = 0;
        vector<int> frequency(26, 0);
        for(auto& ch : chars){
            ++frequency[ch-'a'];
        }
        
        for(int i=0; i<words.size(); ++i){
            vector<int> temp(26, 0);
            bool not_found = true;
            for(auto& ch : words[i]){
                ++temp[ch-'a'];
                if(temp[ch-'a']>frequency[ch-'a']) {
                    not_found = false;
                    break;
                }
            }
            
            if(not_found){
                result += words[i].size();
            }
        }
        
        return result;
    }
};