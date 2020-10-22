class Solution {
public:
    int numRookCaptures(vector<vector<char>>& board) {
        int result = 0;
        vector<int> dy = {-1,1,0,0};
        vector<int> dx = {0,0,-1,1};
        
        int rook_x = 0;
        int rook_y = 0;
        for(int i=0; i<8; ++i){
            for(int j=0; j<8; ++j){
                if(board[i][j] != 'R') continue;
                rook_x = i;
                rook_y = j;
                break;
            }
        }
        
        for(int i=0; i<4; ++i){
            int y = rook_x + dy[i];
            int x = rook_y + dx[i];
            while(x>=0 && y>=0 && x<8 && y<8){
                if(board[y][x] == 'B') break;
                if(board[y][x] == 'p'){
                    ++result;
                    break;
                }
                y += dy[i];
                x += dx[i];
            }
        }
        
        return result;
    }
};