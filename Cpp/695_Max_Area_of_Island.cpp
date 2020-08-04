class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int m = grid.size(), n = grid[0].size();
        vector<vector<bool>>visit(m, vector<bool>(n, false));
        
        int result = 0;
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                result = max(result, recursive(grid, i, j, visit));
            }
        }
        
        return result;
    }
    
    int recursive(vector<vector<int>>& grid, int row, int col, vector<vector<bool>>& visit){
        if(row<0 || col<0 || row>grid.size()-1 || col>grid[0].size()-1 
           || visit[row][col] || grid[row][col] != 1) return 0;
        
        visit[row][col] = true;
        
        int area = 0;
        area += recursive(grid, row + 1, col, visit);
        area += recursive(grid, row - 1, col, visit);
        area += recursive(grid, row, col + 1, visit);
        area += recursive(grid, row, col - 1, visit);
        
        return area + 1;
    }
};