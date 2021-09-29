class Solution {
public:
    int maxAbsoluteSum(vector<int>& nums) {
        int max_sum = 0;
        int min_sum = INT_MAX;
        int positive = 0;
        int negative = 0;
        
        for(auto& num : nums) {
            positive = max(positive + num, 0);
            max_sum = max(max_sum, positive);
            
            negative = min(negative + num, 0);
            min_sum = min(min_sum, negative);
        }
        
        return max(max_sum, -min_sum);
    }
};