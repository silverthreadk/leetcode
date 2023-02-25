class Solution {
public:
    int numSquares(int n) {
        vector<int> dp(n + 1, 0);
        
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j * j <= i; ++j) {
                if(dp[i] == 0) {
                    dp[i] = 1 + dp[i - j * j];
                } else {
                    dp[i] = min(dp[i], dp[i - j * j] + 1);
                }
            }
        }
        
        return dp[n];
    }
};