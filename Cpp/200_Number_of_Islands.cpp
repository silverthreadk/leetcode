class Solution {
public:
    int numIslands(vector<vector<char>>& grid) {
        if(grid.empty()) return 0;
        
        int result = 0;
        queue<pair<int,int>> q;
        int m = grid.size();
        int n = grid.back().size();
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                if(grid[i][j] == '0') continue;
                ++result;
                q.push({i, j});
                while(!q.empty()){
                    auto current = q.front();
                    q.pop();
                    if(current.first > 0 && grid[current.first-1][current.second] == '1') {
                        q.push({current.first-1, current.second});
                        grid[current.first-1][current.second] = '0';
                    }
                    if(current.first+1 < m && grid[current.first+1][current.second] == '1') {
                        q.push({current.first+1, current.second});
                        grid[current.first+1][current.second] = '0';
                    }
                    if(current.second > 0 && grid[current.first][current.second-1] == '1') {
                        q.push({current.first, current.second-1});
                        grid[current.first][current.second-1] = '0';
                    }
                    if(current.second+1 < n && grid[current.first][current.second+1] == '1') {
                        q.push({current.first, current.second+1});
                        grid[current.first][current.second+1] = '0';
                    }
                }
            }
        }
        
        return result;
    }
};