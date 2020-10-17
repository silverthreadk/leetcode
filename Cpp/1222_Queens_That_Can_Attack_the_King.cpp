class Solution {
public:
    vector<vector<int>> queensAttacktheKing(vector<vector<int>>& queens, vector<int>& king) {
        vector<vector<int>> result;
        vector<vector<bool>> board(8, vector<bool>(8, false));
        
        for(auto& queen : queens){
            board[queen[0]][queen[1]] = true;
        }
        
        vector<int> dy = {-1,-1,-1,0,0,1,1,1};
        vector<int> dx = {-1,0,1,-1,1,-1,0,1};
        
        for(int i=0; i<8; ++i){
            int y = king[0] + dy[i];
            int x = king[1] + dx[i];
            while(x>=0 && y>=0 && x<8 && y<8){
                if(board[y][x]){
                    result.push_back({y, x});
                    break;
                }
                y += dy[i];
                x += dx[i];
            }
        }
        
        return result;
    }
};