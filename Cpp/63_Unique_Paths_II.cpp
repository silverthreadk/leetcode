class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        if(obstacleGrid[0][0] == 1) return 0;
        
        int m = obstacleGrid.size();
        int n = obstacleGrid[0].size();
        
        vector<vector<unsigned int>> dp(m, vector<unsigned int>(n, 0));
        
        dp[0][0] = 1;
        
        for(int i=1; i<m; ++i){
            if(obstacleGrid[i][0] == 1) continue;
            dp[i][0] = dp[i-1][0];
        }
        
        for(int i=1; i<n; ++i){
            if(obstacleGrid[0][i] == 1) continue;
            dp[0][i] = dp[0][i-1];
        }
        
        for(int i=1; i<m; ++i){
            for(int j=1; j<n; ++j){
                if(obstacleGrid[i][j] == 1) continue;
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        return dp.back().back();
    }
};