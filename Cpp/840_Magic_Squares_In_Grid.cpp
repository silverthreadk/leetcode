class Solution {
public:
    int numMagicSquaresInside(vector<vector<int>>& grid) {
        if(grid.size() < 3 || grid[0].size() < 3) return 0;
        
        int result = 0;
        for(int i = 0; i<grid.size() - 2; ++i){
            for(int j = 0; j<grid[0].size() - 2; ++j){
                if(isMagicSquare(grid, i, j)) ++result;
            }
        }
        
        return result;
    }
    
    bool isMagicSquare(vector<vector<int>> grid, int row, int col){
        if(grid[row + 1][col + 1] != 5) return false;
        
        set<int> s;
        for(int i = row; i<=row + 2; ++i){
            for(int j = col; j<=col + 2; ++j){
                if(grid[i][j] < 1 || grid[i][j] > 9) return false; 
                s.insert(grid[i][j]);
            }
        }
        if(s.size() < 9) return false;
        
        return grid[row][col] + grid[row][col+1] + grid[row][col+2] == 15
            && grid[row+1][col] + grid[row+1][col+1] + grid[row+1][col+2] == 15
            && grid[row+2][col] + grid[row+2][col+1] + grid[row+2][col+2] == 15
            && grid[row][col] + grid[row+1][col] + grid[row+2][col] == 15
            && grid[row][col+1] + grid[row+1][col+1] + grid[row+2][col+1] == 15
            && grid[row][col+2] + grid[row+1][col+2] + grid[row+2][col+2] == 15
            && grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2] == 15
            && grid[row][col+2] + grid[row+1][col+1] + grid[row+2][col] == 15;
    }
};