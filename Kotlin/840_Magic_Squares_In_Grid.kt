class Solution {
    fun numMagicSquaresInside(grid: Array<IntArray>): Int {
        var result = 0
        
        for(i in 0 until grid.size - 2) {
            for(j in 0 until grid[0].size - 2) {
                if(isMagicSquare(grid, i, j)) ++result
            }
        }
        
        return result
    }

    private fun isMagicSquare(grid: Array<IntArray>, row: Int, col: Int): Boolean {
        if(grid[row + 1][col + 1] != 5) return false
        
        val s = hashSetOf<Int>()
        
        for(i in 0 until 3){
            for(j in 0 until 3){
                if(grid[row + i][col + j] < 1 || grid[row + i][col + j] > 9) return false
                s.add(grid[row + i][col + j])
            }
        }
        if(s.size < 9) return false
        
        return grid[row][col] + grid[row][col + 1] + grid[row][col + 2] == 15
            && grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2] == 15
            && grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2] == 15
            && grid[row][col] + grid[row + 1][col] + grid[row + 2][col] == 15
            && grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1] == 15
            && grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2] == 15
            && grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] == 15
            && grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col] == 15
    }
}