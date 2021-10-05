class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int result = 0;
        unordered_map<int, int> m;
        
        for(int i = 0; i < nums.size(); ++i) {
            ++m[nums[i]];
        }
        
        for(auto& it : m) {
            result += (it.second * (it.second-1)) / 2;
        }
        
        return result;
    }
};