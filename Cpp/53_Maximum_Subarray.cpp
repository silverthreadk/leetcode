class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int result = INT_MIN;
        int sum = 0;
        for(auto num : nums) {
            sum += num;
            result = max(result, sum);
            sum = max(sum, 0);
        }
        
        return result;
    }
};