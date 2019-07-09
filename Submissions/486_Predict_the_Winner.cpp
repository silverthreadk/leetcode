class Solution {
public:
    bool PredictTheWinner(vector<int>& nums) {
        return recursive(nums, 0, nums.size()-1) >= 0;
    }
    
    int recursive(vector<int>& nums, int begin, int end){
        if(begin==end) return nums[begin];
        
        return std::max(nums[begin] - recursive(nums, begin+1, end), nums[end] - recursive(nums, begin, end-1));    
    }
};