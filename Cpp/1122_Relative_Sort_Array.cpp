class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        vector<int> result;
        map<int, int> frequency;
        
        for(int i=0; i<arr1.size(); ++i){
            ++frequency[arr1[i]];
        }
        
        for(int i=0; i<arr2.size(); ++i){
            for(int j=0; j<frequency[arr2[i]]; ++j){
                result.push_back(arr2[i]);
            }
            frequency.erase(arr2[i]);
        }
        
        for(auto num : frequency){
            for(int i=0; i<num.second; ++i){
                result.push_back(num.first);
            }
        }
        
        return result;
    }
};