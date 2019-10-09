class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int result = nums[0];
        int negative = nums[0];
        int positive = nums[0];
        for(int i=1; i<nums.size(); ++i){
            if(nums[i]<0){
                int temp = negative;
                negative = min(nums[i], positive*nums[i]);
                positive = max(nums[i], temp*nums[i]);
            } else {
                negative = min(nums[i], negative*nums[i]);
                positive = max(nums[i], positive*nums[i]);
            }
            result = max(result, positive);
        }
        return result;
    }
};