class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        if(nums.empty()) return 0;
        
        int result = 1;
        int increasing_length = 1;
        for(int i=1; i<nums.size(); ++i){
            if(nums[i]-nums[i-1]>0){
                ++increasing_length;
            } else {
                result = max(result, increasing_length);
                increasing_length = 1;
            }
        }
        return max(result, increasing_length);
    }
};