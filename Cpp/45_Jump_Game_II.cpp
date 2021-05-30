class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n, INT_MAX);
        dp[0] = 0;
        for(int i=0; i<n; ++i){
            int max_jump = min(n, i + 1 + nums[i]); 
            for(int j=i+1; j<max_jump; ++j){
                dp[j] = min(dp[j], dp[i] + 1);
            }
        }
        
        return dp[n-1];
    }
};