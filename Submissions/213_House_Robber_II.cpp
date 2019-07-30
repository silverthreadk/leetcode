class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        if(n<=2) return rob(nums, 0, n-1);
        return max(rob(nums, 0, n-2), rob(nums, 1, n-1));
    }
    
    int rob(vector<int>& nums, int begin, int end) {
        int prev1 = 0, prev2 = 0, curr = 0;
        for(int i = begin; i <= end; ++i){
            curr = max(prev1 + nums[i], prev2); 
            prev1 = prev2;
            prev2 = curr;
        }
        
        return curr;
    }
};