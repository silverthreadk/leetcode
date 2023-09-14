class Solution {
    fun closedIsland(grid: Array<IntArray>): Int {
        var result = 0

        for(i in grid.indices){
            for(j in grid[i].indices){
                if (grid[i][j] == 0 && dfs(i, j, grid)) {
                    ++result
                }
            }
        }

        return result
    }

    fun dfs(x: Int, y: Int, grid: Array<IntArray>): Boolean {
        if (x < 0 || x >= grid.size || y < 0 || y >= grid[x].size) return false
        if (grid[x][y] == 1) return true

        grid[x][y] = 1

        val left = dfs(x - 1, y, grid)
        val right = dfs(x + 1, y, grid)
        val up = dfs(x, y - 1, grid)
        val down = dfs(x, y + 1, grid)
        
        return left && right && up && down
    }
}