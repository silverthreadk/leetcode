class Solution {
public:
    int integerBreak(int n) {
        vector<int> dp = {0, 1, 1, 2};
        
        for(int i=4; i<=n; ++i){
            int current = 0;
            for(int j=1; j<=i/2; ++j){
                current = max({current, dp[i-j]*dp[j], dp[i-j]*j, (i-j)*dp[j], (i-j)*j});
            }
            dp.push_back(current);
        }
        
        return dp[n];
    }
};