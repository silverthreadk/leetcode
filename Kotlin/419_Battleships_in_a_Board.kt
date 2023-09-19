class Solution {
    fun countBattleships(board: Array<CharArray>): Int {
        var result = 0
        
        for(i in board.indices) {
            for(j in board[0].indices) {
                if(board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
                    ++result
                }
            }
        }

        return result
    }
}