class Solution {
public:
    int maxDistance(vector<vector<int>>& grid) {
        int result = -1;
        queue<pair<int,int>> q;
        vector<vector<bool>> visited(grid.size(), vector<bool>(grid.size(), false));
        
        for(int i = 0; i < grid.size(); ++i) {
            for(int j = 0; j < grid.size(); ++j) {
                if(grid[i][j] == 0) continue;
                q.push({i,j});
                visited[i][j] = true;
            }
        }
        
        if(q.size() == grid.size() * grid.size()) return result;
        
        while(!q.empty()) {
            ++result;
            int n = q.size();

            for(int i = 0; i < n; ++i) {
                int y = q.front().first;
                int x = q.front().second;
                
                if(y > 0 && !visited[y - 1][x]) {
                    visited[y - 1][x] = true;
                    q.push({y - 1, x});
                }
                if(y < grid.size() - 1 && !visited[y + 1][x]) {
                    visited[y + 1][x] = true;
                    q.push({y + 1, x});
                }
                if(x > 0 && !visited[y][x - 1]) {
                    visited[y][x - 1] = true;
                    q.push({y, x - 1});
                }
                if(x < grid.size() - 1 && !visited[y][x + 1]) {
                    visited[y][x + 1] = true;
                    q.push({y, x + 1});
                }
                
                q.pop();
            }
        }
        
        return result;
    }
};