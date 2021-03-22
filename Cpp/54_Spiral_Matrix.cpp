class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> result(m * n);
        
        int row = 0;
        int col = 0;
        int step = 0;
        int dir = n == 1 ? 1 : 0;
        int d[4][2] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int i=0; i<m * n; ++i){
            result[i] = matrix[row][col];
            row += d[dir][0];
            col += d[dir][1];
            if ((dir == 0 && col == n - step - 1)
                || (dir == 1 && row == m - step - 1)
                || (dir == 2 && col == step)
                || (dir == 3 && row == step)){
                dir = (dir + 1) % 4;
                if(dir == 3) ++step;
            }
        }
        
        return result;
    }
};