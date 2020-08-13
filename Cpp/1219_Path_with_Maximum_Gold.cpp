class Solution {
public:
    int getMaximumGold(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int result = 0;
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                if(grid[i][j] == 0) continue;
                
                vector<vector<bool>> visited(vector(m, vector(n, false)));
                result = max(result, recursive(grid, i, j, visited));
            }
        }
        return result;
    }
    
    int recursive(vector<vector<int>>& grid, int row, int col, vector<vector<bool>>& visited){
        if(row<0 || col<0 || row>=grid.size() || col>=grid[0].size() || grid[row][col] == 0 || visited[row][col]) return 0;

        visited[row][col] = true;
        int result = max({recursive(grid, row-1, col, visited),
                          recursive(grid, row, col-1, visited),
                          recursive(grid, row+1, col, visited),
                          recursive(grid, row, col+1, visited)}) + grid[row][col];
        visited[row][col] = false;
        
        return result;
    }                                       
};