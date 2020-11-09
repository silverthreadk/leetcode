class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result;
        recursive(result, nums, 0);
        
        return result;
    }
    
    void recursive(vector<vector<int>>& result, vector<int> nums, int index){
        if(index == nums.size()) result.push_back(nums);
        
        for(int i=index; i<nums.size(); ++i){
            swap(nums[index], nums[i]);
            recursive(result, nums, index+1);
            swap(nums[index], nums[i]);
        }
    }
};