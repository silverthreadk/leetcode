class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> s;
        for(auto& num : nums){
            auto result = s.insert(num);
            if(!result.second) return true;
        }
        return false;
    }
};