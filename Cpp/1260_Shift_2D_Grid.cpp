class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<int>> result(m, vector<int>(n, 0));
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                int row = (i+(j+k)/n)%m;
                int col = (j+k)%n;
                result[row][col] = grid[i][j];
            } 
        }
        
        return result;
    }
};