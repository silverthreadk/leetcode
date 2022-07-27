class Solution {
    fun queensAttacktheKing(queens: Array<IntArray>, king: IntArray): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        val board = Array(8){Array(8){false}}
        
        queens.forEach{ queen ->
            board[queen[0]][queen[1]] = true
        }
        
        val dy = arrayOf(-1, -1, -1, 0, 0, 1, 1, 1)
        val dx = arrayOf(-1, 0, 1, -1, 1, -1, 0, 1)
        
        for(i in 0 until 8){
            var y = king[0] + dy[i]
            var x = king[1] + dx[i]
            while(x >= 0 && y >= 0 && x < 8 && y < 8){
                if(board[y][x]){
                    result.add(arrayListOf(y, x))
                    break
                }
                y += dy[i]
                x += dx[i]
            }
        }
        
        return result
    }
}