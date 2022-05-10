class Solution {
    fun getMaximumGold(grid: Array<IntArray>): Int {
        var result = 0
        val m = grid.size
        val n = grid[0].size
        
        for(i in grid.indices){
            for(j in grid[0].indices){
                if(grid[i][j] == 0) continue
                val visited = Array(m + 1) { BooleanArray(n + 1) }
                result = maxOf(result, recursive(grid, i, j, visited))
            }
        }
        
        return result
    }
    
    fun recursive(grid: Array<IntArray>, row: Int, col: Int, visited: Array<BooleanArray>): Int {
        if(row < 0 || col < 0 || row >= grid.size || col >= grid[0].size || grid[row][col] == 0 || visited[row][col]) return 0
        
        visited[row][col] = true
        val result = maxOf(recursive(grid, row-1, col, visited),
                           maxOf(recursive(grid, row, col-1, visited),
                           maxOf(recursive(grid, row+1, col, visited),
                           recursive(grid, row, col+1, visited)))) + grid[row][col]
        visited[row][col] = false
        
        return result
    }
}