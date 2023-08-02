class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        board.forEachIndexed {i, row ->
        row.forEachIndexed {j, _ ->
                if(recursive(board, i, j, word, 0)) return true
            }
        }

        return false
    }
    
    fun recursive(board: Array<CharArray>, row: Int, col: Int, word: String, index: Int): Boolean {
        if(index >= word.length) return true
        
        if(row < 0 || row >= board.size || col < 0 || col >= board[0].size || board[row][col] != word[index]) return false
        
         board[row][col] = '0';
        
        val result = recursive(board, row + 1 , col, word, index + 1)
        || recursive(board, row - 1 , col, word, index + 1)
        || recursive(board, row, col + 1, word, index + 1)
        || recursive(board, row, col - 1, word, index + 1)
        
        board[row][col] = word[index]
        
        return result
    }
}