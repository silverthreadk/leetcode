class Solution {
public:
    vector<string> commonChars(vector<string>& A) {
        vector<string> result;
        vector<int> common_frequency(26, INT_MAX);
        vector<int> frequency(26, 0);
        for(int i=0; i<A.size(); ++i){
            for(auto& ch : A[i]){
                frequency[ch-'a'] += 1;
            }
            
            for(int j=0; j<26; ++j){
                common_frequency[j] = min(common_frequency[j], frequency[j]);
                frequency[j] = 0;
            }
        }
        
        for(int i=0; i<26; ++i){
            for(int j=0; j<common_frequency[i]; ++j){
                string temp = "";
                temp += 'a'+i;
                result.push_back(temp);
            }
        }
        
        return result;
    }
};