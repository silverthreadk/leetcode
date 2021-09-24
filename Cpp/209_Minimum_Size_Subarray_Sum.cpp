class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int result = INT_MAX;
        int index = 0;
        int sum = 0;
        for(int i = 0; i < nums.size(); ++i) {
            sum += nums[i];
            while (target <= sum) {
                result = min(result, i - index + 1);
                sum -= nums[index];
                ++index;
            }
        }
        
        return result == INT_MAX ? 0 : result;
    }
};