class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        int i = INT_MAX;
        int j = INT_MAX;
        for (int k = 0; k < nums.size(); ++k) {
            if (nums[k] > j) return true;
            else if (nums[k] > i) j = nums[k];
            else if (nums[k] < i) i = nums[k];
        }
        
        return false;
    }
};