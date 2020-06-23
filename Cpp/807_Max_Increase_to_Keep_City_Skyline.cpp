class Solution {
public:
    int maxIncreaseKeepingSkyline(vector<vector<int>>& grid) {
        int result = 0;
        int m = grid.size();
        int n = grid[0].size();
        vector<int> row(m, 0);
        vector<int> col(n, 0);
        
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                row[i] = max(row[i], grid[i][j]);
                col[j] = max(col[j], grid[i][j]);
            }
        }
        
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                result += min(row[i], col[j]) - grid[i][j];
            }
        }
        
        return result;
    }
};