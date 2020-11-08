class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
        vector<int> result;
        unordered_map<int, int> m;
        for(auto& num : nums){
            ++m[num];
        }
        
        vector<pair<int, int>> frequency;
        for(auto& it : m){
            frequency.push_back({it.second, it.first});
        }
        sort(frequency.begin(), frequency.end(),
             [](pair<int, int> a, pair<int, int> b) -> bool {
                 if(a.first == b.first) return a.second > b.second;
                 else return a.first < b.first;
        });
        
        for(auto& it : frequency){
            for(int i=0; i<it.first; ++i){
                result.push_back(it.second);
            }
        }
        
        return result;
    }
};