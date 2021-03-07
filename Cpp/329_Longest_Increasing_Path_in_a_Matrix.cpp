class Solution {
public:
    int longestIncreasingPath(vector<vector<int>>& matrix) {
        int result = 0;
        vector<vector<int>> dp(matrix.size(), vector<int>(matrix[0].size(), -1));
        for(int i=0; i<matrix.size(); ++i){
            for(int j=0; j<matrix[0].size(); ++j){
                result = max(result, recursive(matrix, dp, i, j, -1));
            }
        }
        
        return result;
    }
    
    int recursive(vector<vector<int>>& matrix, vector<vector<int>>& dp, int row, int col, int prev) {
        if(row < 0 || col < 0 || row > matrix.size()-1 || col > matrix[0].size()-1
          || prev >= matrix[row][col]) return 0;
        
        if(dp[row][col] != -1) return dp[row][col];
        
        dp[row][col] = 1 + max({recursive(matrix, dp, row-1, col, matrix[row][col]),
                                recursive(matrix, dp, row+1, col, matrix[row][col]),
                                recursive(matrix, dp, row, col-1, matrix[row][col]),
                                recursive(matrix, dp, row, col+1, matrix[row][col])});
        
        return dp[row][col];
    }
};