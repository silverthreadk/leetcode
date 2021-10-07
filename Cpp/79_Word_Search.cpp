class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        for(int i = 0; i < board.size(); ++i) {
            for(int j = 0; j < board[0].size(); ++j) {
                if(recursive(board, i, j, word, 0)) return true;
            }
        }
        
        return false;
    }
    
    bool recursive(vector<vector<char>>& board, int row, int col, string& word, int index) {
        if(index == word.size()) return true;
        if(row < 0 || row >= board.size() || col < 0 || col >= board[0].size()
           || board[row][col] == 0 || board[row][col] != word[index]) return false;
        
        board[row][col] = 0;
        
        bool result = recursive(board, row + 1, col, word, index + 1)
            || recursive(board, row - 1, col, word, index + 1)
            || recursive(board, row, col + 1, word, index + 1)
            || recursive(board, row, col - 1, word, index + 1);
       
        board[row][col] = word[index];
        
        return result;
    }
};