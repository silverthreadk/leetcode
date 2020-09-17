class Solution {
public:
    int countServers(vector<vector<int>>& grid) {
        int result = 0;
        int m = grid.size();
        int n = grid[0].size();
        vector<int> row(m, 0);
        vector<int> col(n, 0);
        
        for(int i = 0; i<m; ++i){
            for(int j = 0; j<n; ++j){
                if(grid[i][j] == 0) continue;
                ++row[i];
                ++col[j];
            }
        }
        
        for(int i = 0; i<m; ++i){
            for(int j = 0; j<n; ++j){
                if(grid[i][j] == 0
                  || (row[i]<2 && col[j]<2)) continue;
                result += 1;
            }
        }
        
        return result;
    }
};