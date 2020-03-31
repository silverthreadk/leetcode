class Solution {
public:
    bool canJump(vector<int>& nums) {
        int max_index = 0;
        for(int i=0; i<nums.size(); ++i) {
            if(max_index < i) break;
            max_index = max(max_index, i + nums[i]); 
        }
        
        return max_index >= nums.size() - 1;
    }
};