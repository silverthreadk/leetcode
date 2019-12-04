class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<int, int> > q;
        int m = grid.size(); int n = grid.back().size();
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                if(grid[i][j] == 2) q.push({i, j});
            }
        }
        
        int time = -1;
        while(!q.empty()){
            int q_size = q.size();
            ++time;
            for(int i=0; i<q_size; ++i){
                auto head = q.front();
                if(head.first > 0 && grid[head.first-1][head.second] == 1) {
                    q.push({head.first-1, head.second});
                    grid[head.first-1][head.second] = 2;
                }
                if(head.first+1 < m && grid[head.first+1][head.second] == 1) {
                    q.push({head.first+1, head.second});
                    grid[head.first+1][head.second] = 2;
                }
                if(head.second > 0 && grid[head.first][head.second-1] == 1) {
                    q.push({head.first, head.second-1});
                    grid[head.first][head.second-1] = 2;
                }
                if(head.second+1 < n && grid[head.first][head.second+1] == 1) {
                    q.push({head.first, head.second+1});
                    grid[head.first][head.second+1] = 2;
                }
                q.pop();
            }
        }
        
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                if(grid[i][j] == 1) return -1;
            }
        }
        
        return max(time, 0);
    }
};