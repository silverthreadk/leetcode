class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int max_sum = 0;
        int sum = 0;
        for(int i=0; i<k; ++i){
            sum += nums[i];
        }
        max_sum = sum;
        for(int i=k; i<nums.size(); ++i){
            sum += nums[i] - nums[i-k];
            max_sum = max(max_sum, sum);
        }
        
        return static_cast<double>(max_sum) / k;
    }
};