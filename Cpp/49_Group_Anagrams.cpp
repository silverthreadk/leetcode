class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> result;
        multimap<string, int> string_to_index;
        
        for(int i=0; i<strs.size(); ++i) {
            string s = strs[i];
            sort(s.begin(), s.end());
            string_to_index.insert(make_pair(s, i));
        }
        
        string prev = "P";
        for(auto& iter : string_to_index){
            if(iter.first != prev) {
                vector<string> temp;
                result.push_back(temp);
            } 
            result.back().push_back(strs[iter.second]);
            prev = iter.first;
        }
        
        return result;
    }
};