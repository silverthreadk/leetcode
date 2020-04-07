class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int index = 0;
        for(int i=0; i<nums.size(); ++i){
            if(nums[index] != 0){
                ++index;
            } else if(nums[i] != 0) {
                nums[index] = nums[i];
                nums[i] = 0;
                ++index;
            }
        }
    }
};