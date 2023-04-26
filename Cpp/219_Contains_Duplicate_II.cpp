class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_map<int, int> m;

        for(int i = 1; i <= nums.size(); ++i) {
            if(m[nums[i - 1]] > 0 && abs(m[nums[i - 1]] - i) <= k) return true;

            m[nums[i - 1]] = i;
        }

        return false;
    }
};