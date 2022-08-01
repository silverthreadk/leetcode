class Solution {
    fun numRookCaptures(board: Array<CharArray>): Int {
        var result = 0
        val dy = arrayOf(-1, 1, 0, 0)
        val dx = arrayOf(0, 0, -1, 1)
        
        var RookX = 0
        var RookY = 0
        for(i in 0 until 8) {
            for(j in 0 until 8) {
                if(board[i][j] != 'R') continue
                RookX = i
                RookY = j
                break
            }
        }
        
        for(i in 0 until 4) {
            var y = RookX + dy[i]
            var x = RookY + dx[i]
            while(x >= 0 && y >= 0 && x < 8 && y < 8) {
                if(board[y][x] == 'B') break
                if(board[y][x] == 'p') {
                    ++result
                    break
                }
                y += dy[i]
                x += dx[i]
            }
        }
        
        return result
    }
}