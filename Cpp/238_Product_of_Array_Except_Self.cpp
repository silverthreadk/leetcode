class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> result(nums.size(), 1);
        int pre = nums.front();
        for(int i=1; i<nums.size(); ++i){
            result[i] *= pre;
            pre *= nums[i];
        }
        
        int post = nums.back();
        for(int i=nums.size()-2; i>=0; --i){
            result[i] *= post;
            post *= nums[i];
        }
        
        return result;
    }
};