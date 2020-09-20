class Solution {
public:
    int projectionArea(vector<vector<int>>& grid) {
        int result = 0;
        int n = grid.size();
        for(int i=0; i<n; ++i){
            int xz = 0, yz = 0;
            for(int j=0; j<n; ++j){
                result += grid[i][j] > 0 ? 1 : 0;
                xz = max(xz, grid[i][j]);
                yz = max(yz, grid[j][i]);
            }
            result += xz + yz;
        }
        
        return result;
    }
};