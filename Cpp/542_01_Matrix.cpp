class Solution {
public:
    vector<vector<int>> updateMatrix(vector<vector<int>>& matrix) {
        int row = matrix.size();
        int col = matrix[0].size();
        vector<vector<int>> result(row, vector<int>(col, INT_MAX));
        queue<pair<int, int>> q;
        for(int i=0; i<row; ++i){
            for(int j=0; j<col; ++j){
                if(matrix[i][j] == 1) continue;
                
                result[i][j] = 0;
                q.push({i,j});
            }
        }
        
        while (!q.empty()) {
            int n = q.size();
            auto p = q.front();
            if (p.first + 1 < row && result[p.first+1][p.second] > result[p.first][p.second] + 1) {
                result[p.first+1][p.second] = result[p.first][p.second]+1;
                q.push({p.first + 1, p.second});
            }
            if (p.first - 1 >= 0 && result[p.first-1][p.second] > result[p.first][p.second] + 1) {
                result[p.first - 1][p.second] = result[p.first][p.second]+1;
                q.push({p.first - 1, p.second});
            }
            if (p.second + 1 < col && result[p.first][p.second+1] > result[p.first][p.second] + 1) {
                result[p.first][p.second + 1] = result[p.first][p.second]+1;
                q.push({p.first, p.second + 1});
            }
            if (p.second - 1 >= 0 && result[p.first][p.second-1] > result[p.first][p.second] + 1) {
                result[p.first][p.second-1] = result[p.first][p.second]+1;
                q.push({p.first, p.second-1});
            }
            q.pop();
        }
        
        return result;
    }
};