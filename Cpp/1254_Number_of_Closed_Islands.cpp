class Solution {
public:
    int closedIsland(vector<vector<int>>& grid) {
        vector<vector<bool>> visited(grid.size(), vector<bool>(grid[0].size(), false));
        int result = 0;
        
        for(int i = 0; i < grid.size(); ++i) {
            for(int j = 0; j < grid[0].size(); ++j) {
                if(grid[i][j] == 0 && !visited[i][j]){
                    if(dfs(i, j, grid, visited)) ++result;
                }
            }
        }

        return result;
    }

    bool dfs(int x, int y, vector<vector<int>>& grid, vector<vector<bool>>& visited) {
        if(x < 0 || x >= grid.size() || y < 0 || y >= grid[0].size()) return false;
        if(grid[x][y] == 1 || visited[x][y]) return true;

        visited[x][y] = true;

        bool left = dfs(x - 1, y, grid, visited);
        bool right = dfs(x + 1, y, grid, visited);
        bool up = dfs(x, y - 1, grid, visited);
        bool down = dfs(x, y + 1, grid, visited);
        
        return left && right && up && down;
    }
};