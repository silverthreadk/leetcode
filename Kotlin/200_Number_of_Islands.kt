class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var result = 0
        
        for(i in grid.indices){
            for(j in grid[i].indices){
                if(grid[i][j] == '1'){
                    recursive(grid, i, j)
                    ++result
                }
            }
        }
        
        return result
    }

    fun recursive(grid: Array<CharArray>, i: Int, j: Int) {
        if (i < 0 || i >= grid.size || j < 0 || j >= grid[i].size || grid[i][j] == '0') return

        grid[i][j] = '0'
        recursive(grid, i - 1, j)
        recursive(grid, i + 1, j)
        recursive(grid, i, j - 1)
        recursive(grid, i, j + 1)
    }
}