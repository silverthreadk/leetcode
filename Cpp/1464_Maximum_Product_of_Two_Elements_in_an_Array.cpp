class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int first = max(nums[0], nums[1]);
        int second = min(nums[0], nums[1]);
        
        for(int i=2; i<nums.size(); ++i){
            if(nums[i]>=first){
                second = first;
                first = nums[i];
            } else if(nums[i]>second){
                second = nums[i];
            }
        }
        
        return (first-1)*(second-1);
    }
};