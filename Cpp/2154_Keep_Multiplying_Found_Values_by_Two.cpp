class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        int result = original;
        unordered_set<int> s(nums.begin(), nums.end());

        while(s.find(result) != s.end()) {
            result *= 2;
        }
        
        return result;
    }
};