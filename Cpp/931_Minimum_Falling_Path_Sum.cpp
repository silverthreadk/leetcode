class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int result = INT_MAX;
        int m = matrix.size();
        int n = matrix[0].size();
        vector<vector<int>> dp(m, vector<int>(n, 0));
        
        for(int i = 0; i < n; ++i) {
            dp[0][i] = matrix[0][i];
        }
        
        for(int i = 1; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                int path = dp[i-1][j];
                if(j > 0) {
                    path = min(path, dp[i-1][j-1]);
                }
                
                if(j < n-1) {
                    path = min(path, dp[i-1][j+1]);
                }
                
                dp[i][j] = matrix[i][j] + path;
            }
        }
        
        for(int i = 0; i < n; ++i) {
            result = min(result, dp[m-1][i]);
        }
        
        return result;
    }
};