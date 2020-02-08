class Solution {
public:
    int findLHS(vector<int>& nums) {
        int result = 0;
        map<int, int> frequencys;
        
        for(auto& num : nums){
            ++frequencys[num];
        }
        
        for(auto& frequency : frequencys){
            auto found = frequencys.find(frequency.first+1);
            if(found != frequencys.end()) {
                result = max(result, frequency.second + found->second);
            }
        }
        return result;
    }
};