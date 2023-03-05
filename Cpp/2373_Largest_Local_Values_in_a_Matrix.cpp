class Solution {
public:
    vector<vector<int>> largestLocal(vector<vector<int>>& grid) {
        int n = grid.size();
        vector<vector<int>> result(n - 2, vector<int>(n - 2));
        
        for(int i = 0; i < n - 2; ++i){
            for(int j = 0; j < n - 2; ++j)
                result[i][j] = getMaxLocal(grid, i, j);
        }    
        
        return result;
    }

    int getMaxLocal(vector<vector<int>>& grid, int row, int col) {
        int result = INT_MIN;
        
        for(int i = row; i < row + 3; ++i){
            for(int j = col; j < col + 3 ; ++j){
                result = max(result, grid[i][j]);
            }
        }

        return result;
    }
};