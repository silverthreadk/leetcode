class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& nums) {
        if(nums.size() < 3) return 0;
        
        int result = 0;
        int count = 0;
        int difference = 0;
        int prev_difference = nums[1] - nums[0];
        
        for(int i = 1; i < nums.size() - 1; ++i) {
            int difference = nums[i + 1] - nums[i];

            if(difference == prev_difference) {
                ++count;
            } else {
                prev_difference = difference;
                count = 0;
            }
            
            result += count;
        }
        
        return result;
    }
};